USE StoredPr_DB; 


DELIMITER //

  
  CREATE FUNCTION pharmacyExist(pharmacy_id int) RETURNS bool
    BEGIN
    RETURN EXISTS(SELECT * FROM pharmacy p WHERE pharmacy_id =  p.id);
  END //
    
    CREATE FUNCTION medicineExist(medicine_id int) RETURNS bool
    BEGIN
    RETURN EXISTS(SELECT * FROM medicine m WHERE medicine_id =  m.id);
  END //
  
  CREATE TRIGGER AfterInsertPharmacyMedicine
    AFTER INSERT
        ON pharmacy_medicine FOR EACH ROW
        BEGIN
      IF(!(pharmacyExist(new.pharmacy_id) and medicineExist(new.medicine_id))) THEN
         SIGNAL SQLSTATE '45000'SET MESSAGE_TEXT = 'Foreign key not exist';
      END IF;
  END; //
    
   CREATE TRIGGER AfterInsertEpmloyee
     AFTER INSERT   
    ON employee FOR EACH ROW
    BEGIN
        IF(!pharmacyExist(new.pharmacy_id))
      THEN SIGNAL SQLSTATE '45000'SET MESSAGE_TEXT = 'Foreign key not exist';
    END IF;
  END //

CREATE TRIGGER AfterInsertMedicine
AFTER INSERT
ON medicine FOR EACH ROW
BEGIN
IF (new.ministry_code NOT RLIKE ('(?i)^[a-z&&[^mp]]{2}[[:hyphen:]]\\d{3}[[:hyphen:]]\\d{2}$'))
THEN SIGNAL SQLSTATE '45000' 
SET MESSAGE_TEXT = 'CHECK Error for insert';
END IF;
END//

CREATE TRIGGER AfterUpdateMedicine
  BEFORE UPDATE
  ON medicine FOR EACH ROW
    BEGIN
  IF(new.ministry_code RLIKE '0{10}') THEN 
    SET new.ministry_code = old.ministry_code;
    ELSEIF(new.ministry_code NOT RLIKE ('(?i)^[a-z&&[^mp]]{2}[[:hyphen:]]\\d{3}[[:hyphen:]]\\d{2}$')) THEN
      SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Incorrect format';
  END IF;
  END//
DELIMITER ;

