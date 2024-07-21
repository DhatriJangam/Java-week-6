public class OverrideSuper {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public int calc(int a, int b) {
        return a + b;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public int calc(int a, int b, int c) {
        return a + b + c;
    }
}
