CREATE TABLE user (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      username VARCHAR(255) NOT NULL UNIQUE,
                      password VARCHAR(255) NOT NULL,
                      email VARCHAR(255) UNIQUE,
                      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);