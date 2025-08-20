package com.example.ecommerce.entity.supplier;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "supplier_contacts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierContact {
    @Id
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    private String contactName;
    private String phone;
    private String email;

    private String address;
    private String ward;
    private String district;
    private String province;
    private String postalCode;
    private String website;

}
