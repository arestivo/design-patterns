package withsingleton;

public class Database {
    public DatabaseResult query(String sql) {
        return new DatabaseResult();
    }

    /** The singleton pattern */
    private static Database uniqueInstance;

    /** Private so it cannot be called from outside this class */
    private Database() {
        /* Whatever needs to be done */
    }

    public static Database instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Database();
            uniqueInstance.connect("withsingleton.Database connection parameters");
        }
        return uniqueInstance;
    }

    private void connect(String parameters) {
        /* Establish database connection */
    }

    private void close() {
        /* Close database connection */
    }
}