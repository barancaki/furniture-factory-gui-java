package products;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public String getImagePath() {
        return "images/modern_table.png";
    }

    @Override
    public CoffeeTable clone() {
        return new ModernCoffeeTable();
    }
}