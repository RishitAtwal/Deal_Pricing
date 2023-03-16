package com.DealPricing.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "db_dealPricing")
public class User {

    @Id
    @Column(name = "emp_code")
    private int employeeCode;
    @Column(name = "userName")
    private String userName;
    @Column(name = "mobile_number")
    private int mobNum;
    @Column(name = "phone_number")
    private String phoneNum;
    @Column(name = "technology")
    private String technology;
    @Column(name = "designation")
    private String designation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address")
    private Address address;
    @OneToMany(targetEntity = Education.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_education")
    private List<Education> educationList;

}
