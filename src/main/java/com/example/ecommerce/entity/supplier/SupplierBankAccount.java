package com.example.ecommerce.entity.supplier;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "supplier_bank_accounts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierBankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    private String bankName;
    private String bankAccountNumber;
    private String bankAccountHolder;
    private String bankBranch;
}
