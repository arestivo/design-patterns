public class CashPayment extends Payment {
    private final double payed;

    public CashPayment(double payed) {
        this.payed = payed;
    }

    @Override
    public void pay(double ammount) throws PaymentFailedException {
        if (payed < ammount)
            throw new PaymentFailedException("Not enough cash!");
        System.out.println("PAYED BY CASH: " + ammount);
    }
}
