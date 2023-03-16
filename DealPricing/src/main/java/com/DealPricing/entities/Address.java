package com.DealPricing.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    private int addressId;
    private String addressType;
    private String city;
    private String state;
    private String country;
    private Long pinCode;


}
