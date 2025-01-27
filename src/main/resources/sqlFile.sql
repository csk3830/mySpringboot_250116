CREATE TABLE user (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      username VARCHAR(255) NOT NULL UNIQUE,
                      password VARCHAR(255) NOT NULL,
                      email VARCHAR(255) UNIQUE,
                      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
CREATE TABLE board(
  id int auto_increment primary key,
  user_id int not null,
  title VARCHAR(255) NOT NULL,
  content TEXT NOT NULL,
  is_del CHAR(1) DEFAULT 'N',
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);