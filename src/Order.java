import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;
    public Order(String customer,Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }
    public String toString() {
        return customer + Arrays.toString(basket);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return customer == order.customer && Objects.equals(basket,order.basket);
    }



}
