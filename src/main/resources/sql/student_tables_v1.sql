
create table students ( id int NOT NULL AUTO_INCREMENT,
 firstname varchar(255) NOT NULL, 
 lastname varchar(255) NOT NULL , 
 dob date NOT NULL, 
 status varchar(255) NOT NULL, 
 org_id int NOT NULL , 
 created_time TIMESTAMP NOT  NULL default now(), 
 last_updated_time TIMESTAMP NOT NULL default now(),
 primary key (id));

/* ==========================================================================*/
/* ==========================================================================*/

create table forms (id int NOT NULL auto_increment,
subject varchar(255) NOT NULL, 
grade varchar(255) NOT NULL, 
status varchar(255) NOT NULL, 
form_code varchar(255) NOT NULL,
created_time TIMESTAMP not null default now(),
last_updated_time TIMESTAMP not null default now(),
primary key(id));

/* ==========================================================================*/
/* ==========================================================================*/

create table enrollments (id int NOT NULL auto_increment , 
student_id int , 
grade varchar(255) NOT NULL, 
subject varchar(255) NOT NULL, 
status varchar(255) NOT NULL, 
form_id int ,
created_time TIMESTAMP not null default now(),
last_updated_time TIMESTAMP not null default now(),
primary key(id), 
CONSTRAINT fk_students FOREIGN KEY (student_id) REFERENCES students(id) , 
CONSTRAINT fk_forms FOREIGN KEY (form_id) REFERENCES forms(id));

/* ==========================================================================*/
/* ==========================================================================*/

create table subjects (id int NOT NULL AUTO_INCREMENT , 
name varchar(255) NOT NULL, 
code varchar(255) NOT NULL, 
description varchar(255) NOT NULL,
created_time TIMESTAMP not null default now(),
last_updated_time TIMESTAMP not null default now(),
primary key(id));

/* ==========================================================================*/
/* ==========================================================================*/

create table grades (id int NOT NULL AUTO_INCREMENT , 
name varchar(255) NOT NULL, 
code varchar(255) NOT NULL, 
description varchar(255) NOT NULL,
created_time TIMESTAMP not null default now(),
last_updated_time TIMESTAMP not null default now(),
primary key(id));

/* ==========================================================================*/
/* ==========================================================================*/


/* To Alter the FOREIGN KEY */

Alter table enrollment ADD  FOREIGN KEY (form_id) REFERENCES form(id);

ALTER TABLE grade RENAME grades;


/* To Alter the FOREIGN KEY for Subject and Grade*/

ALTER TABLE forms MODIFY COLUMN subject int;

ALTER TABLE forms MODIFY COLUMN grade int;

ALTER TABLE enrollments MODIFY COLUMN subject int;

ALTER TABLE enrollments MODIFY COLUMN grade int;

Alter table forms ADD FOREIGN KEY (subject) REFERENCES subjects(id);

Alter table forms ADD FOREIGN KEY (grade) REFERENCES grades(id);

Alter table enrollments ADD FOREIGN KEY (subject) REFERENCES subjects(id);

Alter table enrollments ADD FOREIGN KEY (grade) REFERENCES grades(id);

/* ---------------------------///////////////////////////// ................*/

ALTER TABLE `student`.`forms` DROP FOREIGN KEY `forms_ibfk_2`, DROP FOREIGN KEY `forms_ibfk_1`;

ALTER TABLE `student`.`forms` DROP INDEX `grade` , DROP INDEX `subject` ;

ALTER TABLE `student`.`enrollments`  DROP FOREIGN KEY `enrollments_ibfk_2`, DROP FOREIGN KEY `enrollments_ibfk_1`;

ALTER TABLE `student`.`enrollments`  DROP INDEX `grade` , DROP INDEX `subject` ;

ALTER TABLE forms MODIFY COLUMN subject varchar(255);

ALTER TABLE forms MODIFY COLUMN grade varchar(255);

ALTER TABLE enrollments MODIFY COLUMN subject varchar(255);

ALTER TABLE enrollments MODIFY COLUMN grade varchar(255);


ALTER TABLE `student`.`subjects` ADD UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE;

ALTER TABLE `student`.`grades` ADD UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE;

Alter table forms ADD FOREIGN KEY (subject) REFERENCES subjects(code);

Alter table forms ADD FOREIGN KEY (grade) REFERENCES grades(code);

Alter table enrollments ADD FOREIGN KEY (subject) REFERENCES subjects(code);

Alter table enrollments ADD FOREIGN KEY (grade) REFERENCES grades(code);
