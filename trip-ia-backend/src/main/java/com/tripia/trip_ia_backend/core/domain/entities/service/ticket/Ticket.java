package com.tripia.trip_ia_backend.core.domain.entities.service.ticket;

import com.tripia.trip_ia_backend.core.domain.entities.service.Service;
import lombok.Getter;

import java.util.Date;


@Getter
public class Ticket implements Service {
    String id;
    String name;
    String description;
    String establishmentId;
    String origin;
    String destination;
    Date dateFrom;
    Date dateTo;
    double price;
    TicketType ticketType;

    public Ticket(String name, String description, String establishmentId, String origin, String destination, Date dateFrom, Date dateTo, double price, TicketType ticketType) {
        this.name = name;
        this.description = description;
        this.establishmentId = establishmentId;
        this.origin = origin;
        this.destination = destination;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.price = price;
        this.ticketType = ticketType;
        this.id = java.util.UUID.randomUUID().toString();
    }

    public Ticket(String id, String name, String description, String establishmentId, String origin, String destination, Date dateFrom, Date dateTo, double price, TicketType ticketType) {
        this.name = name;
        this.description = description;
        this.establishmentId = establishmentId;
        this.origin = origin;
        this.destination = destination;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.price = price;
        this.ticketType = ticketType;
        this.id = id;
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
        return this.price;
    }

    @Override
    public String getEstablishmentId() {
        return this.establishmentId;
    }



}
