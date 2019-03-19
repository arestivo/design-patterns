public class Application {
    public static void main(String[] args) {
        Order order = new Order();

        order.addProduct(new Product("Playstation 4", 400));
        order.addProduct(new Product("Red Dead Redemption 2", 60));

        order.setPaymentType(Order.PAYMENT_TYPE.CREDIT_CARD); // What about CC number

        order.pay();
    }
}
