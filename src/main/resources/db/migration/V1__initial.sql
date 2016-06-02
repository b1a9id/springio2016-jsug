CREATE TABLE USER (
  id        BIGINT auto_increment,
  name      VARCHAR(100) NOT NULL,
  email     VARCHAR(100),
  age       INT,
  PRIMARY KEY (id)
);

INSERT INTO USER (name, email, age) VALUES ('内立良介', 'uchitate@tagbangers.co.jp', '26');