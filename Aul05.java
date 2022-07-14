import java.util.Scanner;

public class ex5 {
    public static void main(String [] args) throws IOException {
        try(Scanner leitor = new Scanner(System.in)){
            int inicial  = leitor.nextInt();
            int total    = inicial;
            int cedulas100 = 0;
            int ncedulas50  = 0;
            int cedulass20  = 0;
            int cedulas10  = 0;
            int cedulas5   = 0;
            int cedulas2   = 0;
            int cedulas1   = 0;

            if (total >= 100){
                cedulas100 = total/100;
                total   -= cedulas100*100;
            }
            
            if (total >= 50){
                cedulas50 = total/50;
                total  -= cedulas50*50;
            }

            if (total >= 20){
                cedulas20 = total/20;
                total  -= cedulas20*20;
            }

            if (total >= 10){
                cedulas10 = total/10;
                total  -= cedulas10*10;
            }

            if (total >= 5){
                cedulas5 = total/5;
                total -= cedulas5*5;
            }

            if (total >= 2){
                cedulas2 = total/2;
                total -= cedulas2*2;
            }

            if (total >= 1){
                cedulas1 = total/1;
                total -= cedulas1*1;
            }

            System.out.println("Valor colocado = "    + inicial);
            System.out.println("cédulas de R$100,00 = " + cedulas100);
            System.out.println("cédulas de R$50,00 = "  + cedulas50);
            System.out.println("cédulas de R$20,00 = "  + cedulas20);
            System.out.println("cédulas de R$10,00 = "  + cedulas10);
            System.out.println("cédulas de R$5,00 = "   + cedulas5);
            System.out.println("cédulas de R$2,00 = "   + cedulas2);
            System.out.println("cédulas de R$1,00 = "   + cedulas1);

        }
        
    }
    
}
//Professor essa fiz igual a resolução pois fiquei um pouco perdido 