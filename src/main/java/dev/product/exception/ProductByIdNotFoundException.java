package dev.product.exception;

public class ProductByIdNotFoundException extends RuntimeException {

    public ProductByIdNotFoundException(final String message) {
        super(message);
    }
}
