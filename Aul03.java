import java.util.Scanner;

public class Aul3 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            String Nome = valor.next();

            double Salario = valor.nextDouble();

            double comisao = valor.nextDouble();

            double Media = (comisao*0.15)+Salario;

            System.out.println(String.format(Nome+" recebe: %.2f",Media));
            
            
        }
    }
}