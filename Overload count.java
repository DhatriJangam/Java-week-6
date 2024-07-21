public class OverloadCount {
    public static int find(int a, int b, int c, int d) {
        int largest = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("The largest number is " + largest);
        return largest;
    }

    public static int find(int a, int b, int c) {
        int smallest = Math.min(Math.min(a, b), c);
        System.out.println("The smallest number is " + smallest);
        return smallest;
    }

    public static double find(int a) {
        double sqrt = Math.sqrt(a);
        System.out.printf("The square root of %d is %.1f%n", a, sqrt);
        return sqrt;
    }

    public static void main(String[] args) {
        find(4, 9, 2, 7);
        find(5, 1, 3);
        find(16);
    }
}
