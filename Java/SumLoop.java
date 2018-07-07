import java.util.Scanner;

public class SumLoop {

	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt(),sum = 0;
        sc.nextLine();

        for(int i=0; i < Loops; i++){

        		sum += sc.nextInt();
        }
        System.out.printf("%d %n", sum);
        sc.close();
    }
}