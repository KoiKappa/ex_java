import java.util.Scanner;

public class ex15{
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int x = leitor.nextInt();
            int valortotal = 0;
            int cont = 0;
            while (x >= 0){
                valortotal += x;
                cont++;
                x = leitor.nextInt();
            }
            double media = valortotal/cont;
            System.out.println(String.format("%.2f", media));
        }
    }