CREATE DATABASE IF NOT EXISTS hb_student;

USE hb_student;

DROP TABLE IF EXISTS student;

CREATE TABLE student(
					  id int(11) NOT NULL AUTO_INCREMENT, 
					  first_name VARCHAR(20) DEFAULT NULL,
					  last_name VARCHAR(30) DEFAULT NULL,
					  email VARCHAR(40) NOT NULL UNIQUE,
					  PRIMARY KEY(id)
					 ) AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;
					
					
INSERT INTO student(id,first_name,last_name,email) VALUES (1,'samo','petruska','banda@debilov.sk');
INSERT INTO student(id,first_name,last_name,email) VALUES (2,'Samo','beruska','beruska1337@gmail.com');
INSERT INTO student(id,first_name,last_name,email) VALUES (3,'Sejmo','kodrazi','kod@razi.sk');
INSERT INTO student(id,first_name,last_name,email) VALUES (4,'Miriam','sakdobre','sak@dpbre.sk');
