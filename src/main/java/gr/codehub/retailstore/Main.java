package gr.codehub.retailstore;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Product x1 = new Product(1, "Painting Picasso.Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting .Tzimis", 200, 2000);
        Product x3 = new Product(3, "Chair .Luis", 100, 1000);
        Product x4 = new Product(4, "Vase .Cubic", 500, 5000);

//        Check SimpleRetailStoreImpl

//        Store simple = new SimpleRetailStoreImpl();
//        simple.buy(x1);
//        simple.buy(x3);
//        simple.sell(x1);
//        System.out.println(simple.getRevenue());

//         Check InventoryRetailStoreImpl

        Store invStore = new InventoryRetailStoreImpl();
        invStore.buy(x1);
        invStore.buy(x3);
//      invStore.sell(x1);

//        Cast in method getInventory.
//        getInventory --> method in InventoryRetailStoreImpl not in Store
        ((InventoryRetailStoreImpl) invStore).getInventory();
        System.out.println(((InventoryRetailStoreImpl) invStore).getInventory());
        System.out.println(invStore.getRevenue());

    }
}
