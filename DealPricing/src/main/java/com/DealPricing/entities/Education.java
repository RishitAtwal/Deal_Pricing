package com.DealPricing.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "education")
public class Education {

    @Id
    private int educationId;
    private String grade;
    private int year;
    private String schoolName;
    private String boardName;
    private int score;

}
