import java.util.Scanner;

public class SumsLoop {

	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < Loops; i++){

        		int sum = sc.nextInt() + sc.nextInt();
                System.out.printf("%d ", sum);
        }
            sc.close();
    }
}