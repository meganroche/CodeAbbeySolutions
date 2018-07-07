import java.util.Scanner;

public class MinimumThree {

	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < Loops; i++){

        		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();

                if(a<b && a<c){
                    System.out.printf("%d ",a);
                }
                else if(b<c){
                    System.out.printf("%d ",b);
                }
                else {
                    System.out.printf("%d ",c);
                }
        }
            sc.close();
    }
}