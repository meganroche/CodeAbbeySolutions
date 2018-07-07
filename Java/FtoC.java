import java.util.Scanner;
import java.lang.Math;

public class FtoC {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();

        for(int i=0; i < Loops; i++){

                double a = sc.nextInt();
                double c = (a-32)*(5.0/9.0);

                System.out.printf("%d ",Math.round(c));
        }
            sc.close();
    }
}