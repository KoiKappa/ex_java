import java.util.Scanner;

public class Aul12 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int X = valor.nextInt();

            while (X != 2002) {
                
                System.out.println("Sua senha não e valida.");

                X = valor.nextInt();

            };

            System.out.println("Acesso concluido");
        }
    };
}