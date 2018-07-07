import java.util.Scanner;
import java.lang.Math;

public class Round {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < Loops; i++){

                double a = sc.nextInt(),b = sc.nextInt();
                double c = a/b;

                System.out.printf("%d ",Math.round(c));
        }
            sc.close();
    }
}