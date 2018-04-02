DROP TABLE class_group IF EXISTS;
CREATE TABLE class_group {
	id long identity,
	name varchar(50),
	description varchar(100),
	primary key(id)
};