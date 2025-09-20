package com.tripia.trip_ia_backend.useCases;

import com.tripia.trip_ia_backend.core.application.usecases.SearchForServiceUseCase;
import com.tripia.trip_ia_backend.core.domain.entities.service.SearchParamsDto;
import com.tripia.trip_ia_backend.core.domain.entities.service.Service;
import com.tripia.trip_ia_backend.core.domain.entities.User;
import com.tripia.trip_ia_backend.core.domain.entities.enums.ServiceType;
import com.tripia.trip_ia_backend.infra.repositories.ServiceInMemoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchForServiceUseCaseTest {

    @Test
    void searchForServiceUseCaseTes() {
        ServiceInMemoryRepository serviceRepository = new ServiceInMemoryRepository();

        SearchForServiceUseCase searchForServiceUseCase = new SearchForServiceUseCase(serviceRepository);
        SearchParamsDto searchParamsDto = new SearchParamsDto();

        List<Service> services = searchForServiceUseCase.execute(searchParamsDto);

        Assertions.assertNotNull(services);
    }
}
