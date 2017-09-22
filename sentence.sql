CREATE TABLE Student (
  ID INTEGER NOT NULL,
  name  VARCHAR2(100) ,
  age INTEGER
);

ALTER TABLE Student ADD (
  CONSTRAINT dept_pk PRIMARY KEY (ID));

CREATE SEQUENCE dept_seq;
CREATE OR REPLACE TRIGGER dept_bir
BEFORE INSERT ON Student
FOR EACH ROW
WHEN (new.id IS NULL)
BEGIN
  SELECT dept_seq.NEXTVAL
  INTO   :new.id
  FROM   dual;
END;
/








CREATE OR REPLACE PROCEDURE GETRECORD  (
in_id IN NUMBER,
out_name OUT VARCHAR2,
out_age  OUT NUMBER) AS
BEGIN
   SELECT name, age
   INTO out_name, out_age
   FROM Student where id = in_id;
END;
