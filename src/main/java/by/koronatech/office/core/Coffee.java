package by.koronatech.office.core;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Coffee {
    private Long id;
    private String name;
    private Integer amount;
    private Integer cost;

}
