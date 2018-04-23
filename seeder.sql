USE blog_db;

SHOW TABLES;
DROP TABLE posts;
DROP TABLE users;

DESCRIBE posts;
DESCRIBE users;

SELECT * FROM users;

SHOW CREATE TABLE posts;

INSERT INTO users (username, email, password)
VALUES ('jamesf', 'james@gmail.com', 'pa$$');

