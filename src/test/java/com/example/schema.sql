CREATE TABLE user (
  id        BIGINT auto_increment,
  name      VARCHAR(100) NOT NULL,
  email     VARCHAR(100),
  age       INT,
  gender VARCHAR(10) NOT NULL,
  password VARCHAR(500) NOT NULL,
  PRIMARY KEY (id)
);