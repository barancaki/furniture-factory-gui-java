package products;

public class ArtDecoChair implements Chair {
    public String getImagePath() {
        return "images/artdeco_chair.png";
    }

    public Chair clone() {
        return new ArtDecoChair();
    }
}
