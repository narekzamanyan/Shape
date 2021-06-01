public class Square extends Rectangle {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean isFilled, double side) {
        super.setColor(color);
        super.setFilled(true);
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return 4.0 * this.side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public void setLength(double length) {
        this.side = length;
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        this.side = width;
        super.setLength(width);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square[" +
                super.toString() +
                "]";
    }
}
