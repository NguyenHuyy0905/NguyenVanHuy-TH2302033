import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String customerName;
    private Date transactionTime;
    private ArrayList<LineItem> lineItems = new ArrayList<>();

    public Order() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", transactionTime=" + transactionTime +
                ", lineItems=" + lineItems +
                '}';
    }

    public double cost() {
        double sum = 0;
        for(LineItem li : lineItems) {
            sum += li.cost();
        }
        return sum;
    }

    public boolean addProduct(Product product, int quantity ) {
        if (quantity <= product.getQuantity()) {
            LineItem newLineItem = new LineItem(product, quantity);
            lineItems.add(newLineItem);
            System.out.println("Success");
            return true;
        } else {
            System.out.println("Fail");
            return false;
        }
    }
}
