package dev.product.entite;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "products")
@Data
@RequiredArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private int price;

    @Column(name = "category")
    private String category;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "inventory_status")
    private String inventoryStatus;

    @Column(name = "rating")
    private int rating;

    public Product(final String code, final String name, final String description, final String image, final int price,
                   final String category, final int quantity, final String inventoryStatus, final int rating) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.inventoryStatus = inventoryStatus;
        this.rating = rating;
    }




}
