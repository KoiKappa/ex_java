import java.util.Scanner;


public class Aul18 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            double x = valor.nextDouble();
            double y = valor.nextDouble();
            if (x == 0 && y == 0) {
                System.out.println("Começo");
            } else if (x == 0) {
                System.out.println(" X");
            } else if (y == 0) {
                System.out.println(" Y ");
            } else if (y > 0 && x > 0) {
                System.out.println("A1");
            } else if (y > 0 && x < 0) {
                System.out.println("A2");
            } else if (y < 0 && x < 0) {
                System.out.println("A3");
            } else if (y < 0 && x > 0) {
                System.out.println("A4");
            }
        }
    };
}