package com.pjatk.reposaturday.reposaturday;

import com.pjatk.reposaturday.reposaturday.model.Bike;
import com.pjatk.reposaturday.reposaturday.repository.BikeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReposaturdayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReposaturdayApplication.class, args);
        {
            Bike bike1 = new Bike(5, "Avensis", "Toyota", false, 1993);
            Bike bike2 = new Bike(6, "Vectra", "Opel", false, 1992);

            BikeRepository bikeRepository = new BikeRepository();
            bikeRepository.save(bike1);
            bikeRepository.save(bike2);

//        bikeRepository.removeById(6);
            bikeRepository.setRentedStatus(bike1, true);


            for (Bike bike : bikeRepository.getAll()) {
                System.out.println(bike);
            }
        }
    }
}
