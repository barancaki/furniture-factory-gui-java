package factories;

import products.Chair;
import products.CoffeeTable;
import products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
