CREATE DATABASE points_db;

USE points_db;

CREATE TABLE points (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        x DOUBLE NOT NULL,
                        y DOUBLE NOT NULL
);