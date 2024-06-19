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
  ('k8l6j58jl', 'Lime Band', 'Product Description', 'lime-band.jpg', 79, 'Fitness', 12, 'INSTOCK', 3),
  ('f230fh0g3', 'Bamboo Watch', 'Product Description', 'bamboo-watch.jpg', 65, 'Accessories', 24, 'INSTOCK',5),
  ('nvklal433', 'Black Watch', 'Product Description', 'black-watch.jpg', 72, 'Accessories', 61, 'INSTOCK', 4),
  ('zz21cz3c1', 'Blue Band', 'Product Description', 'blue-band.jpg', 79, 'Fitness', 2, 'LOWSTOCK',3),
  ( '244wgerg2', 'Blue T-Shirt', 'Product Description', 'blue-t-shirt.jpg', 29, 'Clothing', 25, 'INSTOCK', 5),
  ('h456wer53', 'Bracelet', 'Product Description', 'bracelet.jpg', 15, 'Accessories', 73, 'INSTOCK', 4),
  ('av2231fwg', 'Brown Purse', 'Product Description', 'brown-purse.jpg', 120, 'Accessories', 0, 'OUTOFSTOCK', 4),
  ('bib36pfvm', 'Chakra Bracelet', 'Product Description', 'chakra-bracelet.jpg', 32, 'Accessories', 5, 'LOWSTOCK', 3),
  ('mbvjkgip5', 'Galaxy Earrings', 'Product Description', 'galaxy-earrings.jpg', 34, 'Accessories', 23, 'INSTOCK',5),
  ('cm230f032', 'Gaming Set', 'Product Description', 'gaming-set.jpg', 299, 'Electronics', 63, 'INSTOCK', 3),
  ('plb34234v', 'Gold Phone Case', 'Product Description', 'gold-phone-case.jpg', 24, 'Accessories', 0, 'OUTOFSTOCK', 4),
  ('4920nnc2d', 'Green Earbuds', 'Product Description', 'green-earbuds.jpg', 89, 'Electronics', 23, 'INSTOCK', 4),
  ('250vm23cc', 'Green T-Shirt', 'Product Description', 'green-t-shirt.jpg', 49, 'Clothing', 74, 'INSTOCK', 5);

