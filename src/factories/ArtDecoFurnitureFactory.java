package factories;
import products.*;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ArtDecoChair();
    }

    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
