package homework12.additionalTasks.task4;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car implements Serializable {
    private String brand;
    private int speed;
    private int price;
}
