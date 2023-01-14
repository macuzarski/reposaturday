package com.pjatk.reposaturday.reposaturday.mapper;

import com.pjatk.reposaturday.reposaturday.model.Bike;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Bike mapBikeDTOToBike(BikeDTO bikeDTO) {
        Bike bike = new Bike();
        bike.setId(bikeDTO.getId());
        bike.setModel(bikeDTO.getModel());
        bike.setMake(bikeDTO.getMake());
        bike.setProductionYear(bikeDTO.getProductionYear());
        bike.setRented(bikeDTO.isRented());
        return bike;
    }

    public BikeDTO mapBikeToBikeDTO(Bike bike) {
        BikeDTO bikeDTO = new BikeDTO();
        bikeDTO.setId(bikeDTO.getId());
        bikeDTO.setModel(bikeDTO.getModel());
        bikeDTO.setMake(bikeDTO.getMake());
        bikeDTO.setProductionYear(bikeDTO.getProductionYear());
        bikeDTO.setRented(bikeDTO.isRented());
        return bikeDTO;
    }
}
