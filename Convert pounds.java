public class ConvertPounds {
    public static double convertIt(double pounds) {
        return pounds * 0.453592;
    }

    public static void main(String[] args) {
        double pounds = 150;
        double kilograms = convertIt(pounds);
        System.out.printf("%.2f pounds is %.2f kilograms.%n", pounds, kilograms);
    }
                          }
