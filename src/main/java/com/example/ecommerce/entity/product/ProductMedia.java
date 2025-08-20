package com.example.ecommerce.entity.product;

import com.example.ecommerce.enums.MediaType;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "product_media")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class ProductMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    private String url; // link tới ảnh/video

    @Enumerated(EnumType.STRING)
    private MediaType type; // IMAGE hoặc VIDEO

    private Boolean isThumbnail; // nếu là ảnh thì đánh dấu ảnh đại diện

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
