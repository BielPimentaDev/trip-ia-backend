package com.tripia.trip_ia_backend.infra.repositories;

import com.tripia.trip_ia_backend.core.application.ports.repository.ServicesPortRepository;
import com.tripia.trip_ia_backend.core.domain.entities.service.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceInMemoryRepository implements ServicesPortRepository {
    private final List<Service> services;

    public ServiceInMemoryRepository() {
        this.services = new ArrayList<>();
    }

    @Override
    public List<Service> getServices() {
        return services;
    }

    @Override
    public Service getService(String id) {
        return services.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null); // ou lançar uma exceção se preferir
    }

    @Override
    public void upsertService(Service service) {
        services.removeIf(s -> s.getId().equals(service.getId()));
        services.add(service);
    }
}
