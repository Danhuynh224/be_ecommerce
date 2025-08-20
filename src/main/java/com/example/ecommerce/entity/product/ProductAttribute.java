package com.example.ecommerce.entity.product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product_attributes")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class ProductAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    private String name;   // "Màu sắc"
    private String value;  // "Đen"

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
