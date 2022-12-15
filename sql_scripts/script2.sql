    use hb_student;

DROP TABLE IF EXISTS instructor_detail;

CREATE TABLE instructor_detail(
	id int NOT NULL AUTO_INCREMENT,
	youtube_channel VARCHAR(45) DEFAULT NULL,
	hobby VARCHAR(45) DEFAULT NULL,
	PRIMARY KEY (id)
)charset=UTF8;

DROP TABLE IF EXISTS instructor;

CREATE TABLE instructor (
	id int NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	email VARCHAR(45),
	instructor_detail int,
	PRIMARY KEY (id),
	FOREIGN KEY(instructor_detail) REFERENCES instructor_detail(id)
	ON DELETE NO ACTION
	)charset=UTF8;
	
	