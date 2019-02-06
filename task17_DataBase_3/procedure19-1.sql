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
    
  DELIMITER ;