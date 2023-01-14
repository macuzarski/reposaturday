package com.pjatk.reposaturday.reposaturday.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BikeDTO {
    private int id;
    private String model;
    private String make;
    private boolean isRented;
    private int productionYear;
}
