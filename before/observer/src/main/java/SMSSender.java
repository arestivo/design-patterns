public class SMSSender {
    private final String number;

    public SMSSender(String number) {
        this.number = number;
    }

    public void sendMessage(String message) {
        System.out.println("Message \"" + message + "\" sent to " + number);
    }
}
