package products;

public class VictorianSofa implements Sofa {
    public String getImagePath() {
        return "images/victorian_sofa.png";
    }

    public Sofa clone() {
        return new VictorianSofa();
    }
}