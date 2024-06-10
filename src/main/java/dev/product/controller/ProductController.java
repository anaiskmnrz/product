package dev.product.controller;

import dev.product.entite.Product;
import dev.product.entite.dto.ProductRequestDto;
import dev.product.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable final int id) {
        Product product = this.productService.getProduct(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable final int id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productService.deleteProduct(id));
    }

    @PostMapping
    public ResponseEntity<Product> postProduct(@RequestBody @Valid ProductRequestDto productRequest) {
        Product productSave = productService.postProduct(productRequest.getCode(), productRequest.getName(), productRequest.getDescription(),
                productRequest.getImage(), productRequest.getPrice(), productRequest.getCategory(),
                productRequest.getQuantity(), productRequest.getInventoryStatus(), productRequest.getRating());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productSave);
    }

    /** request body
     * not null sauf image et rating, peut-être le présenter autrement ? voir code norauto
     * try catch
     * catch exepctions du service + exceptions générales
     *
     * voir lombok
     *
     * faire update
     */
}
