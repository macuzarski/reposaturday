package com.pjatk.reposaturday.reposaturday.repository;


import com.pjatk.reposaturday.reposaturday.model.Bike;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BikeRepository {

    private List<Bike> bikes = new ArrayList<>();

    public List<Bike> getAll() {
        return bikes;
    }

    public Optional<Bike> findById(int id) {
        return bikes.stream()
                .filter(bike -> bike.getId() == id)
                .findFirst();
    }

    public List<Bike> findAllByMake(String make) {
        return bikes.stream()
                .filter(bike -> bike.getMake().equals(make))
                .toList();
    }

    public void save(Bike bike) {
        if (bikes.contains(bike)) {
            System.out.println("Bike already present!");
        }
        bikes.add(bike);
    }

    public void removeById(int id) {
        Optional<Bike> tempBike = this.findById(id);

        tempBike.ifPresent(bike -> bikes.remove(bike));
    }

    public void removeAll() {
        bikes = new ArrayList<>();
    }


    public void setRentedStatus(Bike bike, boolean isRented) {
        bikes.stream()
                .filter(b -> b.equals(bike))
                .forEach(b -> b.setRented(isRented));
    }

}
