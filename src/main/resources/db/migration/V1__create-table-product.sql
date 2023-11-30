CREATE TABLE product (
    id VARCHAR(255) PRIMARY KEY,
    name TEXT NOT NULL,
    description TEXT,
    category VARCHAR(50),
    sku VARCHAR(20),
    stock_quantity INT,
    price DECIMAL(10,2) NOT NULL,
    active BOOLEAN,
    image_url VARCHAR(255),
    data_creation DATE,
    apply_discount BOOLEAN
);