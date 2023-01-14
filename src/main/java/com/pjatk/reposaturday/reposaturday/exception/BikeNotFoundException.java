package com.pjatk.reposaturday.reposaturday.exception;

import lombok.Data;

@Data
public class BikeNotFoundException extends RuntimeException{
    String message = "Bike not found exception";
}
