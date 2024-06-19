package dev.product.entite.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductRequestDto {

    @NotBlank(message = "Code invalide: code est vide")
    @NotNull(message = "Code invalide: code est NULL")
    private String code;

    @NotBlank(message = "Nom invalide: name est vide")
    @NotNull(message = "Nom invalide: name est NULL")
    private String name;

    @NotBlank(message = "Description invalide: description est vide")
    @NotNull(message = "Description invalide: description est NULL")
    private String description;

    private String image;

    private int price;

    @NotBlank(message = "Catégorie invalide: category est vide")
    @NotNull(message = "Catégorie invalide: category est NULL")
    private String category;

    private int quantity;

    @NotBlank(message = "Statut inventaire invalide: inventoryStatus est vide")
    @NotNull(message = "Statut inventaire invalide: inventoryStatus est NULL")
    private String inventoryStatus;

    private int rating;


}
