import java.util.ArrayList;
import java.util.List;

public class Order {
    enum PAYMENT_TYPE { CREDIT_CARD, MB_WAY, CASH, TRANSFER }

    private PAYMENT_TYPE paymentType;
    private List<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setPaymentType(PAYMENT_TYPE paymentType) {
        this.paymentType = paymentType;
    }

    public void pay() {
        double total = 0;

        for (Product product : products)
            total += product.getPrice();

        switch (paymentType) {
            case CREDIT_CARD:
                //...
                break;
            case MB_WAY:
                //...
                break;
            case CASH:
                //...
                break;
            case TRANSFER:
                //...
                break;
        }
    }
}
