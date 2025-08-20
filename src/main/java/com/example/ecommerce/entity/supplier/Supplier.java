package com.example.ecommerce.entity.supplier;

import com.example.ecommerce.enums.SupplierStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column(nullable = false, unique = true, length = 50)
    private String code;    // Mã nhà cung cấp

    @Column(nullable = false)
    private String fullName;    // Tên đầy đủ

    private String brandName;   // Thương hiệu
    private String seoSlug;     // Link thân thiện SEO

    @Enumerated(EnumType.STRING)
    private SupplierStatus status; // ACTIVE, INACTIVE, PENDING

    private Double rating;
    private Integer totalProducts;
    private Integer totalOrders;
    private Double avgProcessingTime;

    @OneToOne(mappedBy = "supplier", cascade = CascadeType.ALL)
    private SupplierContact contact;

    @OneToOne(mappedBy = "supplier", cascade = CascadeType.ALL)
    private SupplierLegal legal;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private List<SupplierBankAccount> bankAccounts;

    @OneToOne(mappedBy = "supplier", cascade = CascadeType.ALL)
    private SupplierStore store;
}
