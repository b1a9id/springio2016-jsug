ALTER TABLE USER ADD password VARCHAR(500) after name;
UPDATE USER SET password = 'uchitate';
ALTER TABLE USER modify password VARCHAR(500) NOT NULL;