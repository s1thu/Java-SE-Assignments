package vehicle_rental_system.model;

public class Customer {
    private int id;
    private String name;
    private String address;
    private static int customerCount = 0;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        customerCount++;
        this.id = customerCount;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
