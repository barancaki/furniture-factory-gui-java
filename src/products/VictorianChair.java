package products;

public class VictorianChair implements Chair {
    public String getImagePath() {
        return "images/victorian_chair.png";
    }

    public Chair clone() {
        return new VictorianChair();
    }
}