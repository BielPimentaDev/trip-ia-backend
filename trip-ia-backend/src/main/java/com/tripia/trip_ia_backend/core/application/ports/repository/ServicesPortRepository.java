package com.tripia.trip_ia_backend.core.application.ports.repository;

import com.tripia.trip_ia_backend.core.domain.entities.service.Service;

import java.util.List;

public interface ServicesPortRepository {
    List<Service> getServices();
    Service getService(String id);
    void upsertService(Service service);
}
