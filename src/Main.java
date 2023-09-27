import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Câu 2 A:
        Product tomato = new Product("F523", "Tomato", "Food", 1.5, 589);
        Product zaraShirt = new Product("A763", "Zara shirt", "Apperance", 12.0, 90);
        Product kitchenTable = new Product("H320", "Kitchen table", "Household", 299.2, 13);
        Product iPhone = new Product("E092", "IPhone", "Electronic", 1000.0, 4);
        Product football = new Product("S108", "Football", "Sport", 19.9, 2);

        // Câu 2 B:
        System.out.println("\nCÂU 2B:");

        String dateString_1 = "2023-08-08 11:30:00";
        SimpleDateFormat dateFormat_1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date_1 = dateFormat_1.parse(dateString_1);

        Order order = new Order();
        order.setCustomerName("Mike Tyson");
        order.setTransactionTime(date_1);

        System.out.println("Add: " + order.addProduct(tomato, 5));
        System.out.println("Total cost of order: " + order.cost());
        System.out.println("Add: " + order.addProduct(iPhone, 2));
        System.out.println("Total cost of order: " + order.cost());
        System.out.println("Add: " + order.addProduct(football, 4));
        System.out.println("Total cost of order: " + order.cost());

        System.out.println("Information: " + order);

        // Câu 2 C:
        System.out.println("\nCÂU 2C:");

        String dateString_2 = "2023-08-08 11:30:00";
        SimpleDateFormat dateFormat_2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date_2 = dateFormat_1.parse(dateString_2);

        DeliverOrder deliverOrder = new DeliverOrder();
        deliverOrder.setCustomerName("Chris Evans");
        deliverOrder.setTransactionTime(date_2);
        deliverOrder.setAddress("123 Cau Giay");

        System.out.println("Add: " + deliverOrder.addProduct(zaraShirt, 3));
        System.out.println("Total cost of order: " + deliverOrder.cost());
        System.out.println("Add: " + deliverOrder.addProduct(iPhone, 3));
        System.out.println("Total cost of order: " + deliverOrder.cost());

        System.out.println("Information: " + deliverOrder);
    }

}