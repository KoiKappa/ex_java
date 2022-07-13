import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws IOException{
        try (Scanner leitor = new Scanner(System.in)) {
            int valor1 = leitor.nextInt();

            int valor2 = leitor.nextInt();

            int pro = valor1*valor2;

            System.out.println("pro = " + pro);
        }

    }

    
}