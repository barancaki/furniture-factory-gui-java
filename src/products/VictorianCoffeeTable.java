package products;

public class VictorianCoffeeTable implements CoffeeTable {
    public String getImagePath() {
        return "images/victorian_table.png";
    }

    public CoffeeTable clone() {
        return new VictorianCoffeeTable();
    }
}
