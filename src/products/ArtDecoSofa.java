package products;

public class ArtDecoSofa implements Sofa {
    public String getImagePath() {
        return "images/artdeco_sofa.png";
    }

    public Sofa clone() {
        return new ArtDecoSofa();
    }
}