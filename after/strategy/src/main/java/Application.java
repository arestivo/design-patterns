public class Application {
    public static void main(String[] args) throws PaymentFailedException {
        Order order = new Order();

        order.addProduct(new Product("Playstation 4", 400));
        order.addProduct(new Product("Red Dead Redemption 2", 60));

        order.setPayment(new CashPayment(400));

        order.pay();
    }
}
