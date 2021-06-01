public class Shape {
    private String color = "red";
    private boolean isFilled = true;

    public Shape() {
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", isFilled=" + isFilled +
                ']';
    }
}
