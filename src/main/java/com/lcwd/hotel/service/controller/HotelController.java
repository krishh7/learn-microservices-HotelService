package com.lcwd.hotel.service.controller;

import com.lcwd.hotel.service.entity.Hotel;
import com.lcwd.hotel.service.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel serviceHotel = hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceHotel);
    }

    //get single
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId) {
        Hotel singleHotel = hotelService.getSingleHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(singleHotel);
    }

    //get all
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> allHotels = hotelService.getAllHotels();
        return ResponseEntity.status(HttpStatus.OK).body(allHotels);
    }
}
