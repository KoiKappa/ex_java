import java.util.Scanner;

public class ex13 {
    public static void main(String [] args) throws IOException {
        
        int senha = 2002;
        try(Scanner leitor = new Scanner(System.in)){
            int test = leitor.nextInt();

            
            while (test != senha){
                System.out.println("Senha Incorreta");
                test = leitor.nextInt();
            }
            System.out.println("Login Efetuado");

        }
        

    }
}