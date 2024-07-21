public class OverrideSub extends OverrideSuper {
    public double area(double radius) {
        System.out.println("Calculating area of a circle in OverrideSub");
        return super.area(radius);
    }
    public int calc(int a, int b) {
        System.out.println("Calculating sum in OverrideSub");
        return super.calc(a, b);
    }

    public static void main(String[] args) {
        OverrideSub obj = new OverrideSub();
        System.out.println("Area: " + obj.area(5));
        System.out.println("Sum: " + obj.calc(3, 4));
        System.out.println("Area: " + obj.area(4, 5));
        System.out.println("Sum: " + obj.calc(1, 2, 3));
    }
}
