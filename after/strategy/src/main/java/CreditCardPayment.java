public class CreditCardPayment extends Payment {
    private String number;
    private String security;

    public CreditCardPayment(String number, String security) {
        this.number = number;
        this.security = security;
    }

    @Override
    public void pay(double ammount) {
        System.out.println("PAYED BY CC: " + ammount);
    }
}
