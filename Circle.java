public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                super.toString() +
                ", radius=" + radius +
                "]";
    }
}
