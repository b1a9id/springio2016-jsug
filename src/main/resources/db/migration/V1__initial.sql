CREATE TABLE USER (
  id        BIGINT auto_increment,
  name      VARCHAR(100) NOT NULL,
  email     VARCHAR(100),
  age       INT,
  PRIMARY KEY (id)
);

INSERT INTO USER (name, email, age) VALUES ('試験一郎', 'shiken@ichiro.co.jp', '44');
INSERT INTO USER (name, email, age) VALUES ('試験二郎', 'shiken@jiro.co.jp', '26');
INSERT INTO USER (name, email, age) VALUES ('試験三郎', 'shiken@saburo.co.jp', '12');
INSERT INTO USER (name, email, age) VALUES ('試験太郎', 'shiken@taro.co.jp', '33');