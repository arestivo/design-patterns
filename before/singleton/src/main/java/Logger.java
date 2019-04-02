public class Logger {
    enum SEVERITY {LOG, DEBUG, WARNING, ERROR}

    public Logger() {
        //... Opens log file
    }

    public void log(String text, SEVERITY severity) {
        //.. Writes to log file
    }
}
