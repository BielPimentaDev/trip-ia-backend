package com.tripia.trip_ia_backend.core.domain.entities.service.hotel;

import com.tripia.trip_ia_backend.core.domain.entities.service.Service;
import org.springframework.boot.ApplicationRunner;

public class Hotel implements Service {

    String name;
    String description;
    String id;
    String establishmentId;
    String address;
    int starRating;
    double pricePerNight;
    double totalPrice;

    public Hotel(String name, String description, String establishmentId, String address, int starRating, double pricePerNight, double totalPrice) {
        this.name = name;
        this.description = description;
        this.establishmentId = establishmentId;
        this.address = address;
        this.starRating = starRating;
        this.pricePerNight = pricePerNight;
        this.totalPrice = totalPrice;
        this.id =  java.util.UUID.randomUUID().toString();
    }

    public Hotel(String id, String name, String description, String establishmentId, String address, int starRating, double pricePerNight, double totalPrice) {
        this.name = name;
        this.description = description;
        this.establishmentId = establishmentId;
        this.address = address;
        this.starRating = starRating;
        this.pricePerNight = pricePerNight;
        this.totalPrice = totalPrice;
        this.id =  id;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Number getTotalPrice() {
        return this.totalPrice;
    }

    @Override
    public String getEstablishmentId() {
        return this.establishmentId;
    }
}
