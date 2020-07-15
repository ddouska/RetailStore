package gr.codehub.retailstore;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStoreImpl implements Store {

    private List<Product> products;
    private double buyBalance;
    private double sellBalance;

    public InventoryRetailStoreImpl() {
        products = new ArrayList<>();
    }

    public List<Product> getInventory() {
        // List<Product> p = new ArrayList<>(products);
        return new ArrayList<>(products);
    }

    public void reset() {
        products.clear();
    }

    @Override
    public void buy(Product pd) {
        buyBalance += pd.getPriceWhenBuy();
        products.add(pd);
    }

    @Override
    public void sell(Product pd) {
        sellBalance += pd.getPriceWhenSell();
        products.remove(pd);
    }

    @Override
    public double getRevenue() {
        return sellBalance - buyBalance;
    }
}
