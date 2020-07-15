package gr.codehub.retailstore;

public interface Store {

    void buy(Product pd);

    void sell(Product pd);

    double getRevenue();

}
