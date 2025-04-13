package products;
public interface Chair extends Cloneable {
    String getImagePath();
    Chair clone();
}