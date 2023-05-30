CREATE TABLE IF NOT EXISTS product(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL
);
CREATE TABLE IF NOT EXISTS filedb(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL,
    data BLOB,
    prodid INT NOT NULL,
    FOREIGN KEY (prodid) REFERENCES product(id)
    );