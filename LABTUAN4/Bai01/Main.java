public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle.toString());
        System.out.println("=>> Dien tich Circle: " + circle.getArea());

        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");
        System.out.println(cylinder.toString());
        System.out.println("=>> The tich Cylinder: " + cylinder.getVolume());
    }
}
