import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < Loops; i++){

            int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt(),sum = 0;

                for(int j=0; j<n; j++){

                    sum = sum + (a + (j * b));
                }

                System.out.printf("%d ",sum);
        }
            sc.close();
    }
}