public class Logger {
    enum SEVERITY {LOG, DEBUG, WARNING, ERROR}

    private static Logger uniqueInstance;

    public static Logger instance() {
        if (uniqueInstance == null)
            uniqueInstance = new Logger();
        return uniqueInstance;
    }

    public Logger() {
        //... Opens log file
    }

    public void log(String text, SEVERITY severity) {
        //.. Writes to log file
    }
}
