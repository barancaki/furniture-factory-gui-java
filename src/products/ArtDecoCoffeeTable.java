package products;

public class ArtDecoCoffeeTable implements CoffeeTable {
    public String getImagePath() {
        return "images/artdeco_table.png";
    }

    public CoffeeTable clone() {
        return new ArtDecoCoffeeTable();
    }
}
