package com.example.Darna.dao.entities;
import java.util.Locale.Category;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "immeubles")
public class immeuble {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "code", length = 10, unique = true)
    private String code;
    @Column(name = "name", length = 30, nullable = false)
    private String name;
  
    
    @Column(name = "image", length = 50, nullable = true)
    private String image;
    @Column (name="price, length=10, nullable= false")
private double price;
    @Column(name = "category" ,length = 15,nullable = true)
    private String category;
        @Column(name = "superficie")
    private double superficie;
    

}

