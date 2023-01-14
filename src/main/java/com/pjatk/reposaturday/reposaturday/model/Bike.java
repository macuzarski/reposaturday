package com.pjatk.reposaturday.reposaturday.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bike {
    private int id;
    private String model;
    private String make;
    private boolean isRented;
    private int productionYear;

}
