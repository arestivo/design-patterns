package withoutsingleton;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;

    public static List<Animal> getAllAnimals(Database db) {
        DatabaseResult result = db.query("SELECT * FROM animal");

        List<Animal> animals = new ArrayList<>();
        /** get animals from database result object */

        return animals;
    }

    public String getName() {
        return name;
    }

    public String getLocation(Database db) {
        DatabaseResult result = db.query("SELECT location FROM location WHERE animal = " + name);

        String location = "";
        /** get location from database result object */

        return location;
    }
}
