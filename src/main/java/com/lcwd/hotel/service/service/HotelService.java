package com.lcwd.hotel.service.service;

import com.lcwd.hotel.service.entity.Hotel;

import java.util.List;

public interface HotelService {

    //Create
    Hotel createHotel(Hotel hotel);

    //Get all
    List<Hotel> getAllHotels();

    //Get single
    Hotel getSingleHotel(String id);
}
