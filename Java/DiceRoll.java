import java.util.Scanner;
import java.lang.Math;

public class DiceRoll {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();

        for(int i=0; i<loops; i++){
            
            double a = Math.floor(sc.nextDouble()*6) + 1;
            int b = (int)a;
            System.out.printf("%d ",b);
        }
    }
}