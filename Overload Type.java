public class OverloadType {
    public static float sum(int a, float b) {
        float result = a + b;
        System.out.printf("The rounded sum is %.1f%n", result);
        return result;
    }

    public static void sum(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sum(5, 3.2f);
        sum("SampleString", 3);
    }
}
