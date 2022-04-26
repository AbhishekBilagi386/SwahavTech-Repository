CREATE TABLE College(
College_id varchar(5) NOT NULL,
College_name varchar(50),
location varchar(50),
PRIMARY KEY(College_id));

CREATE TABLE Student(
Student_id varchar(5) NOT NULL,
Student_name varchar(50) NOT NULL,
department VARCHAR(5) NOT NULL,
College_id VARCHAR(5) NOT NULL,
PRIMARY KEY(Student_id),
FOREIGN KEY(College_id) REFERENCES College(College_id));

INSERT INTO `College`
VALUES ("101","Kle","belgaum"),
("102","BVB","hubli");

INSERT INTO `Student`
VALUES ("1","Abhishek","CSE","101"),
("2","Himanshu","CSE","101"),
("3","ROhan","CSE","102");

CREATE TABLE Address (
Building_num VARCHAR(5) NOT NULL,
Area VARCHAR(20) NOT NULL,
city VARCHAR(50) NOT NULL,
Pincode VARCHAR(50) NOT NULL,
PRIMARY KEY(Pincode),
FOREIGN KEY(Building_num) REFERENCES College(College_id));

INSERT INTO `Address`
VALUES ("101","Bhagya Nagar","Belgaum","590001"),
("102","Dharwad Road","Hubli","12345");
