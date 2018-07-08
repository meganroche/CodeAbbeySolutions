import java.util.Scanner;

public class LinearFunction {
    public static void main(String[] args){ 

        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();

        for(int i=0; i<Loops; i++){

            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();

            // calc for output
            int x = (y1 - y2)/(x1 - x2);
            int y = y1 - (x*x1);

            System.out.printf("(%d %d) ",x,y);
        }   
        sc.close();    
    }
}