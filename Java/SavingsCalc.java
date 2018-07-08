import java.util.Scanner;
import java.lang.Math;

public class SavingsCalc {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<loops; i++){

            double s = sc.nextInt();
            int r = sc.nextInt();
            int p = sc.nextInt();
            int years = 0;

            while(s<r){
                s *= ((p/100.0)+1);
                // s = Math.floor(s);
                years++;
            }
            System.out.printf("%d ",years);
        }
    }
}