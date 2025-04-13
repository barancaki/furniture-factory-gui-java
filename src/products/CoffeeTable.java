package products;

public interface CoffeeTable extends Cloneable {
    String getImagePath();
    CoffeeTable clone();
}