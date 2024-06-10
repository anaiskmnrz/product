DROP TABLE IF EXISTS products;

CREATE TABLE products
(
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    code VARCHAR(10) NOT NULL,
    name VARCHAR(75) NOT NULL,
    description VARCHAR(250) NOT NULL,
    image VARCHAR(100),
    price INT NOT NULL,
    category VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    inventory_status VARCHAR(25) NOT NULL,
    rating INT
);

INSERT INTO products (code, name, description, image, price, category, quantity, inventory_status, rating ) VALUES
  ('pxpzczo23', 'Purple Band', 'Product Description', 'purple-band.jpg', 79, 'Fitness', 6, 'LOWSTOCK', 3),
  ('2c42cb5cb', 'Purple Gemstone Necklace', 'Product Description', 'purple-gemstone-necklace.jpg', 45,
  'Accessories', 62, 'INSTOCK', 4);

