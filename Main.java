public class Main {
    public static void main(String[] args) {
        System.out.println("KKKK");
        Shape shape1 = new Shape();
        Rectangle c1 = new Rectangle();
        Square s1 = new Square("Blue", true, 2.5);
        Rectangle r1 = new Rectangle("YELLOW", true, 2.1, 2.1);


        s1.setLength(3.1);
        s1.setWidth(3.5);
        s1.setColor("GREEN");
        System.out.println(s1);
        System.out.println(r1);
    }
}
