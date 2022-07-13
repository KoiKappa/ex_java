import java.util.Scanner;

public class Aul7 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int Nu = valor.nextInt();
            
            for (int X=1; I <= Nu; X++) {
                int Z = valor.nextInt();

                int Y = valor.nextInt();

                if ((Y == 0) | ((Z % Y) != 0)) {
                    System.out.println("Divisão seria impossivel de ser completada.");
                } else {
                    System.out.println((double)X/Y);
                }
            };
        }
    };
}