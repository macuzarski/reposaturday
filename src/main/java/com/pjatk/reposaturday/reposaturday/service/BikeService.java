package com.pjatk.reposaturday.reposaturday.service;

import com.pjatk.reposaturday.reposaturday.exception.BikeNotFoundException;
import com.pjatk.reposaturday.reposaturday.model.Bike;
import com.pjatk.reposaturday.reposaturday.repository.BikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {

    private final BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public List<Bike> getAll() {
        return bikeRepository.getAll();
    }

    public Bike findById(int id) {
        Bike bike = new Bike();
        if(bikeRepository.findById(id).isPresent()){
        bike = bikeRepository.findById(id).get();
        } else {
            throw new BikeNotFoundException();
        }
        return bike;
    }

    public void saveBike(Bike bike) {
        bikeRepository.save(bike);
    }

    public void removeById(int id) {
        bikeRepository.removeById(id);
    }

}
