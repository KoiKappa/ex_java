import java.util.Scanner;

public class Aul9 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int Numero = valor.nextInt();

            for (int X=1; X= Numero; X++) {
                int Y = valor.nextInt();

                System.out.println("Valor "+X+": "+Y);
            };
        }
    }; 
}