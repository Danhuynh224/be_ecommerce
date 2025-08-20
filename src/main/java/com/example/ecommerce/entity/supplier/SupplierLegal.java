package com.example.ecommerce.entity.supplier;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "supplier_legals")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierLegal {
    @Id
    private String id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    private String businessLicenseNumber;
    private String taxCode;
    private String licenseIssuedPlace;
    private LocalDate licenseIssuedDate;

    private String idCardNumber;    // nếu cá nhân
    private LocalDate idCardIssuedDate;
}
