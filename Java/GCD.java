import java.util.Scanner;

public class GCD {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<loops; i++){
            int a = sc.nextInt(),b = sc.nextInt(),tempA = a,tempB = b,gcd,lcm;
            while(tempA!=tempB){
                if(tempA>tempB){
                tempA = tempA-tempB;
                }
                else {
                tempB = tempB-tempA;
                }
            }
            gcd = tempA;
            lcm = (a*b)/gcd;
            System.out.printf("(%d %d) ",gcd,lcm);
        }
    }
}