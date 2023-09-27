public class DeliverOrder extends Order{
    private String address;

    public DeliverOrder() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "DeliverOrder{" +
                "customerName='" + super.getCustomerName() + '\'' +
                ", transactionTime=" + super.getTransactionTime() +
                ", address=" + address +
                ", lineItems=" + super.getLineItems() +
                '}';
    }
}
