public class Logger {
    enum SEVERITY {LOG, DEBUG, WARNING, ERROR}

    private static Logger uniqueInstance;

    private Logger() {
        //... Opens log file
    }

    public static Logger instance() {
        if (uniqueInstance == null)
            uniqueInstance = new Logger();
        return uniqueInstance;
    }

    public void log(String text, SEVERITY severity) {
        //.. Writes to log file
    }
}
