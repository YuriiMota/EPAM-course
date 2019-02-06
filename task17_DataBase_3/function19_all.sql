DELIMITER //
CREATE function MinExperience()
RETURNS DECIMAL(10, 1)
DETERMINISTIC
    BEGIN
		RETURN (SELECT Min(experience) from employee);
    END //
  
  CREATE function getHouse(f_key int)
RETURNS VARCHAR(45)
DETERMINISTIC
    BEGIN
		RETURN (SELECT CONCAT(name,' ',building_number)as Building FROM pharmacy where id=f_key);
    END //
    
  DELIMITER ;