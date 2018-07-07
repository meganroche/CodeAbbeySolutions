import java.util.Scanner;

public class SumDigits {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < Loops; i++){

           int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
           int e = a * b + c;
           int sum = 0;

           while(e > 0){
            sum += e % 10
            e /= 10
           }
           System.out.printf("%d ",sum);
        }
            sc.close();
    }
}