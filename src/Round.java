public class Round {
    public static void roundStock(double x) {
        if (x % 1 > 0.5) {
            System.out.println(Math.ceil(x));
        } else if (x % 1 < 0.5) {
            System.out.println(Math.floor(x) + 0.5);
        } else if (x % 1 == 0) {
            System.out.printf("%.1f", x);
        }
    }
}
