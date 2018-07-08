import java.util.Scanner;
import java.lang.Math;

public class AvgArray {
    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();

        for(int i=0; i<Loops; i++){

            int j = 0, a;
            double avg = 0;
            sc.nextLine();

            while((a = sc.nextInt()) != 0){
            avg += a;
            j++;
        }
        avg /= j;
        System.out.printf("%d ",Math.round(avg));
        }   
        sc.close();    
    }
}