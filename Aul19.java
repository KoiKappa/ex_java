import java.util.Scanner;

public class ex19 {
    
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            
            double x = leitor.nextDouble();
            double y = leitor.nextDouble();
            
            if (x == 0 && y == 0) {
                System.out.println("Origem");
            
            } else if (x == 0) {
                System.out.println("Eixo Y");
            
            } else if (y == 0) {
                System.out.println("Eixo X");
            
            } else if (y > 0 && x > 0) {
                System.out.println("Q1");
            
            } else if (y > 0 && x < 0) {
                System.out.println("Q2");
            
            } else if (y < 0 && x < 0) {
                System.out.println("Q3");
            
            } else if (y < 0 && x > 0) {
                System.out.println("Q4");
            }               
        }
    }
}
//Professor essa fiz  igual a resaolução pois fiquei perdidão