import java.util.Scanner;

public class MinimumTwo {

	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < Loops; i++){

        		int a = sc.nextInt(),b = sc.nextInt();

                if(a<b){
                    System.out.printf("%d ",a);
                }
                else {
                    System.out.printf("%d ",b);
                }
        }
            sc.close();
    }
}