package by.koronatech.office.api.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class CreateCoffeeDto {
    private String name;
    private Integer amount;
    private Integer cost;
}
