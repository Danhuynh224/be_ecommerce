package com.example.ecommerce.entity.supplier;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "supplier_stores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierStore {
    @Id
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    private String logoUrl;
    private String bannerUrl;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String deliveryAreas;
}
