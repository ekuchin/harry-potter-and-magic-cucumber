package hogwarts;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Student {

    private String name;
    private Houses house;
    private int strength;
    private int perception;
    private int endurance;
    private int charisma;
    private int intelligence;
    private int agility;
    private int luck;

}
