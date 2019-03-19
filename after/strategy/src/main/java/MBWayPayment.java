public class MBWayPayment extends Payment {
    private String qrcode;

    public MBWayPayment(String qrcode) {
        this.qrcode = qrcode;
    }

    @Override
    public void pay(double ammount) {
        System.out.println("PAYED BY MBWAY: " + ammount);
    }
}
