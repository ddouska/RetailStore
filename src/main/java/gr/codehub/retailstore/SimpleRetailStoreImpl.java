package gr.codehub.retailstore;

import java.util.ArrayList;
import java.util.List;

public class SimpleRetailStoreImpl implements Store {

    public double totalBuyBalance;
    public double totalSellBalance;


    @Override
    public void buy(Product pd) {
        totalBuyBalance += pd.getPriceWhenBuy();
    }

    @Override
    public void sell(Product pd) {
        totalSellBalance += pd.getPriceWhenSell();
    }


    @Override
    public double getRevenue() {
        double dif;
        dif = totalSellBalance - totalBuyBalance;
        return dif;
    }
}
