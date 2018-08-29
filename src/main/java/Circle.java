public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Hình tròn có bán kính: " + getRadius();
    }
}
