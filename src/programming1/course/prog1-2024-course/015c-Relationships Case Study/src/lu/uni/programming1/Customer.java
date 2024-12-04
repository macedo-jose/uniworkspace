package lu.uni.programming1;

public class Customer {
    private String name;
    private Address address;
    // [1] "Customer has-a Order" relationship (cardinality 0..*) is *not* modeled
    //     explicitly, but could be done e.g. using an array 'orders' holding all
    //     orders of this customer

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", address=" + address + "]";
    }
}
