package Adapter;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("복순이"));
        animals.add(new Dog("핑크"));
        animals.add(new Cat("냐옹이"));
        animals.add(new TigerAdapter("타이온"));

        animals.forEach((animal) -> animal.sound());
    }
}
