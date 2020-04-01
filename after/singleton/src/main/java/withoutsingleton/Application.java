package withoutsingleton;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Database database = new Database();
        database.connect("database connection parameters");

        List<Animal> animals = Animal.getAllAnimals(database);
        for (Animal animal : animals)
            System.out.println(animal.getName() + " " + animal.getLocation(database));

        database.close();
    }
}
