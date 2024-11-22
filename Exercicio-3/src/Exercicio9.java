public class Exercicio9 {
    public static void exercicio() {
        System.out.println("Fahrenheit -> Celsius");
        for (int f = 100; f <= 150; f++) {
            double c = 5.0 / 9 * (f - 32);
            System.out.printf("%d -> %.2f\n", f, c);
        }
    }
}
