package com.pjatk.reposaturday.reposaturday.service;

import com.pjatk.reposaturday.reposaturday.exception.BikeNotFoundException;
import com.pjatk.reposaturday.reposaturday.model.Bike;
import com.pjatk.reposaturday.reposaturday.repository.BikeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BikeServiceTest {

    private final BikeRepository bikeRepository = mock(BikeRepository.class);
    private final BikeService bikeService = new BikeService(bikeRepository);
    private Bike bike;

    @BeforeEach
    void setUp() {
        bike = new Bike(4, "ZX-505", "Giant", false, 1993);
    }

    @Test
    void getAll() {
    }

    @Test
    void findByIdShouldReturnBikeWhenGivenCorrectId() {
        //given
        int id = 4;
//        Bike bike = new Bike(4, "ZX-505", "Giant", false, 1993);

        //when
        when(bikeRepository.findById(id)).thenReturn(Optional.of(bike));
        Bike result = bikeService.findById(id);

        //then
        assertEquals(result, bike);
    }

    @Test
    void shouldThrowExceptionIfBikeNotFound() {
        //given
        int id = 3;

        //when
        when(bikeRepository.findById(4)).thenReturn(Optional.of(bike));

        //then
        Assertions.assertThrows(BikeNotFoundException.class, () -> bikeService.findById(id));
    }


    @Test
    void saveBike() {
    }

    @Test
    void removeById() {
    }
}