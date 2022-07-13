import java.util.Scanner;

public class Aul2 {
    public static void main(String[] args) throws Exception {
        try (Scanner Val = new Scanner(System.in)) {
            double X = Val.nextDouble();
    
            double Y = Val.nextDouble();

            double Z = Val.nextDouble();
    
            if ((X == 0) | (Y * Y - 4 * X * Z < 0)) {
                System.out.println("Valor nao valido, tente novamente por gentileza.");
                return;
            }

            double bhask = Math.sqrt((Y * Y) - 4 * X * Z);

            double R1 = (-Y + bhask)/ (2 * X);

            double R2 = (-Y - bhask)/ (2 * X);

            System.out.println(String.format("A1 = %.5f",A1));
            System.out.println(String.format("A2 = %.5f",A2));
        };


    }
}