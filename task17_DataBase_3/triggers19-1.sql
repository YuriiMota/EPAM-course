USE StoredPr_DB; 

-- INSERT INTO  eployee VALUES ('Danik','Inna','Borisivna','8432943243','RC-432452',20.1,'1990-22-12','Doctor',1;
-- SELECT * from post;
-- INSERT INTO post VALUES('director'), ('pharmacist'),('intern');
DELIMITER //
CREATE TRIGGER BeforeInsertPost
AFTER INSERT
ON post FOR EACH ROW
BEGIN
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Post can\'t be modified';
END//

CREATE TRIGGER BeforeUpdatePost
AFTER UPDATE
ON post FOR EACH ROW
BEGIN
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Post can\'t be modified';
END//

CREATE TRIGGER BeforeDeletePost
AFTER DELETE
ON post FOR EACH ROW
BEGIN
SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Post can\'t be modified';
END//

DELIMITER ;

