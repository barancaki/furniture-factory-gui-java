package products;

public class ModernSofa implements Sofa {
    @Override
    public String getImagePath() {
        return "images/modern_sofa.png";
    }

    @Override
    public Sofa clone() {
        return new ModernSofa();
    }
}
