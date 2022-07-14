import java.util.Scanner;
public class ex11 {
    public static void main(String [] args) throws IOException {
        int X = 1;
        int Y = 60;

        while (Y >= 0){
            System.out.println("X = " + X + "  Y = " + Y);
            Y -= 5;
            X += 3;
        }
    }
}