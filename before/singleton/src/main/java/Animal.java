import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;

    public static List<Animal> getAllAnimals() {
        Database db = new Database();
        db.connect("Database connection parameters");
        DatabaseResult result = db.query("SELECT * FROM animal");
        db.close();

        List<Animal> animals = new ArrayList<>();
        /** get animals from database result object */

        return animals;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        Database db = new Database();
        db.connect("Database connection parameters");
        DatabaseResult result = db.query("SELECT location FROM location WHERE animal = " + name);
        db.close();

        String location = "";
        /** get location from database result object */

        return location;
    }
}
