public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getArea() {
        return getRadius() * getRadius() * 3.14;
    }

    public String toString() {
        return "Hình trụ có chiều cao là: " + getHeight() + " và có diện tích là: " + getArea();
    }
}
