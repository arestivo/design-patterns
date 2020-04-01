package withsingleton;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Animal> animals = Animal.getAllAnimals();
        for (Animal animal : animals)
            System.out.println(animal.getName() + " " + animal.getLocation());
    }
}
