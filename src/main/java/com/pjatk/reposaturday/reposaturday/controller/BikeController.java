package com.pjatk.reposaturday.reposaturday.controller;

import com.pjatk.reposaturday.reposaturday.mapper.BikeDTO;
import com.pjatk.reposaturday.reposaturday.model.Bike;
import com.pjatk.reposaturday.reposaturday.service.BikeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bike")
public class BikeController {

    private final BikeService bikeService;

    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }

    @GetMapping
    public List<Bike> findAllBikes() {
        return bikeService.getAll();
    }

    @GetMapping("/{id}")
    public Bike findById(@PathVariable int id) {
        return bikeService.findById(id);
    }

    @PostMapping("/save")
    public ResponseEntity<Bike> saveBike(@RequestBody Bike bike) {
        bikeService.saveBike(bike);

        return ResponseEntity.ok(bike);
    }
}
