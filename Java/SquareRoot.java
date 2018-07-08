import java.util.Scanner;

public class SquareRoot {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<loops; i++){
            double r = 1;
            int x = sc.nextInt();
            int loops2 = sc.nextInt();
            for(int j=0; j<loops2; j++){
                
                double d = (x/r);
                r =(r+d)/2.0;
            }
            System.out.printf("%.10f ",r);
        }
    }
}