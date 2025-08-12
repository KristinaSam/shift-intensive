package by.koronatech.office.core.service.impl;

import by.koronatech.office.api.dto.GetCoffeeDto;

import java.util.List;

public interface CoffeeService {
    GetCoffeeDto getById (long id);
    List<GetCoffeeDto> getAllCoffees();
}
