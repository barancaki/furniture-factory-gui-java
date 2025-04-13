package products;

public class ModernChair implements Chair {
    @Override
    public String getImagePath() {
        return "images/modern_chair.png";
    }

    @Override
    public Chair clone() {
        return new ModernChair(); // Basit clone örneği
    }
}