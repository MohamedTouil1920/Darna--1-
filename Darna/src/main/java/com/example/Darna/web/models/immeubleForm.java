package com.example.Darna.web.models;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class immeubleForm {

    private Long id;

    @NotBlank(message = "Code is required")
    
    private String code;

    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.01", message = "Price must be greater than or equal to 0.01")
    private Double price;

    @NotNull(message = "superficies is required")
    @Min(value = 1, message = "superficie must be greater than or equal to 1")
    private double superficie;
    @NotNull(message = "Category is required")
    

    private String image;

}

