CREATE TABLE ROLE (
  id        BIGINT auto_increment,
  role      VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO ROLE (role) VALUES ('ADMIN');
INSERT INTO ROLE (role) VALUES ('USER');
