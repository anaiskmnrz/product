package dev.product.service;

import dev.product.entite.Product;
import dev.product.exception.ProductByIdNotFoundException;
import dev.product.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(final int id) {
        return productRepository.findById(id).orElseThrow(()
                -> new ProductByIdNotFoundException("L'id " + id + " n'est relié à aucun produit."));
    }

    public String deleteProduct(final int id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return "le produit avec l'id " + id + " a bien été supprimé.";
        } else {
            throw new ProductByIdNotFoundException("L'id " + id + " n'est relié à aucun produit.");
        }
    }

    @Transactional
    public Product postProduct(final String code, final String name, final String description,
                            final String image, final int price, final String category, final int quantity,
                            final String inventoryStatus, final int rating) {
        Product product = new Product(code, name, description, image, price, category, quantity, inventoryStatus, rating);
        return this.productRepository.save(product);
    }

    @Transactional
    public Product patchProduct(final String code, final String name, final String description,
                                final String image, final int price, final String category, final int quantity,
                                final String inventoryStatus, final int rating) {
        
        return null;
    }
}
