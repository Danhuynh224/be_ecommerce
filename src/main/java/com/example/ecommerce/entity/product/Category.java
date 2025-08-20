package com.example.ecommerce.entity.product;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;       // Tên danh mục: "Điện thoại", "Laptop"
    private String slug;       // Đường dẫn SEO: "dien-thoai", "laptop"

    // Danh mục cha (có thể null nếu là root)
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    // Danh mục con
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Category> children = new ArrayList<>();
}
