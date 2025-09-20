package com.tripia.trip_ia_backend.core.application.usecases;

import com.tripia.trip_ia_backend.core.application.ports.repository.ServicesPortRepository;
import com.tripia.trip_ia_backend.core.domain.entities.service.SearchParamsDto;
import com.tripia.trip_ia_backend.core.domain.entities.service.Service;

import java.util.List;

public class SearchForServiceUseCase {
    ServicesPortRepository repository;
    public SearchForServiceUseCase(ServicesPortRepository repository) {
        this.repository = repository;
    }
    public List<Service> execute(SearchParamsDto searchParamsDto) {
        return repository.getServices();
    }
}
