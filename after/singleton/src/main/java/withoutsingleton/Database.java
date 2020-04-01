package withoutsingleton;

public class Database {
    public DatabaseResult query(String sql) {
        return new DatabaseResult();
    }

    public void connect(String parameters) {
        /* Establish database connection */
    }

    public void close() {
        /* Close database connection */
    }
}