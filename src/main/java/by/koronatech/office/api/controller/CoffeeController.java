package by.koronatech.office.api.controller;

import by.koronatech.office.api.dto.CreateCoffeeDto;
import by.koronatech.office.api.dto.GetCoffeeDto;
import by.koronatech.office.core.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffee")
@Slf4j
public class CoffeeController {

    @GetMapping("/{id}")
    public GetCoffeeDto getById(@PathVariable long id){
        log.info("Get coffee by id: {}", id);
    }

    @GetMapping("/{id}")
    public List<GetCoffeeDto> getByCost(@RequestParam int cost){
        log.info("Get coffee by id: {}", id);
    }

    @PostMapping
    public GetCoffeeDto create(@RequestBody CreateCoffeeDto createCoffeeDto){
return new GetCoffeeDto(null, null, null, null);
    }

    @PutMapping("/{id}")
    public GetCoffeeDto create(@PathVariable long id, @RequestBody CreateCoffeeDto createCoffeeDto){
        return new GetCoffeeDto(null, null, null, null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){

    }

}
