DELIMITER //
CREATE PROCEDURE InsertToEmployee(
	IN surname            VARCHAR(30),
    IN last_name          CHAR(30), 
    IN midle_name         VARCHAR(30),
    IN identity_number    CHAR(10),
    IN passport           CHAR(10),
    IN experience         DECIMAL(10, 1),
    IN birthday           DATE,
    IN post               VARCHAR(15),
    IN pharmacy_id        INT)
    BEGIN
		INSERT INTO employee(surname,name,midle_name, identity_number,passport,experience,birthday,post,pharmacy_id)
        VALUES (surname,last_name,midle_name,identity_number,passport,experience,birthday,post, pharmacy_id );
    END //
    
    CREATE PROCEDURE InsertIntoMedicineZone(m_id int,z_id int)
BEGIN
  IF(!(zoneExist(z_id) and medicineExist(m_id))) THEN
    SIGNAL SQLSTATE '45000'SET MESSAGE_TEXT = 'Foreign key not exist!';
  END IF;
  INSERT INTO medicine_zone VALUES(m_id,z_id);
END //
-- 3
CREATE PROCEDURE createRandEmployeeRows()
BEGIN
  DECLARE done int DEFAULT false;
  DECLARE SurnameT varchar(30); 
    DECLARE NameT char(30);
    DECLARE i int DEFAULT 0;
  DECLARE St_Cursor10 CURSOR
  FOR SELECT surname, name FROM employee;
  DECLARE CONTINUE HANDLER
  FOR NOT FOUND SET done = true;
  OPEN St_Cursor10;
myLoop: LOOP
    FETCH St_Cursor10 INTO SurnameT, NameT;
    IF done=true THEN LEAVE myLoop;
    END IF;
        Set @Surname = SurnameT;
    SET  @temp_query1 = CONCAT('CREATE TABLE ',@Surname,' (id int primary key);');
    PREPARE myquery FROM @temp_query1;
    EXECUTE myquery;
    DEALLOCATE PREPARE myquery;
        SET @random =  (FLOOR(RAND()*10))%9+1;
        SET i = 0;
    
        WHILE (i<@random) DO
      IF(i=0) THEN
        SET  @buffer = CONCAT('INSERT INTO ', @Surname,' VALUES');
            END IF;
            SET @buffer = CONCAT(@buffer,'(',i,')');
            IF(i!=@random-1) THEN
        SET @buffer = CONCAT(@buffer,', ');
            END IF;
            SET i = i+1;
    END WHILE;
        SET i = 0;
  PREPARE myquery2 FROM @buffer;
  EXECUTE myquery2;
    SET @buffer = '';
  DEALLOCATE PREPARE myquery2; 
  END LOOP;
  CLOSE St_Cursor10;
END//


CREATE PROCEDURE createRandEmployeeColumns()
BEGIN
  DECLARE done int DEFAULT false;
  DECLARE SurnameT varchar(30); 
    DECLARE NameT char(30);
    DECLARE i int DEFAULT 0;
  DECLARE St_Cursor10 CURSOR
  FOR SELECT surname, name FROM employee;
  DECLARE CONTINUE HANDLER
  FOR NOT FOUND SET done = true;
  OPEN St_Cursor10;
myLoop: LOOP
    FETCH St_Cursor10 INTO SurnameT, NameT;
    IF done=true THEN LEAVE myLoop;
    END IF;
        Set @Surname = SurnameT;
    SET  @buffer = CONCAT('CREATE TABLE ',@Surname,'( ');
    -- PREPARE myquery FROM @temp_query1;
    -- EXECUTE myquery;
    -- DEALLOCATE PREPARE myquery;
        SET @random =  (FLOOR(RAND()*10))%9+1;
        SET i = 0;
    
        WHILE (i<@random) DO
            SET @buffer = CONCAT(@buffer,'col',i,' int');
            IF(i!=@random-1) THEN
        SET @buffer = CONCAT(@buffer,', ');
            END IF;
            SET i = i+1;
    END WHILE;
        SET i = 0;
        SET @buffer = CONCAT(@buffer,' );');
  PREPARE myquery2 FROM @buffer;
  EXECUTE myquery2;
    SET @buffer = '';
  DEALLOCATE PREPARE myquery2; 
  END LOOP;
  CLOSE St_Cursor10;
END//

  DELIMITER ;