import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private Payment payment;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


    public void pay() throws PaymentFailedException {
        double total = 0;

        for (Product product : products)
            total += product.getPrice();

        payment.pay(total);
    }
}
