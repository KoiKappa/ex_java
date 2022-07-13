import java.util.Scanner;

public class Aul10 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int X = 1;

            int Y = 60;

            while (Y>= 0) {
                System.out.println("X = "+X+"    Y = "+Y);

                Y -= 5;

                X++; 
            };
        }
    };
}