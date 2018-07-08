import java.util.Scanner;
import java.math.BigInteger;

public class ModularCalc {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        BigInteger sum = BigInteger.valueOf(i);
        sc.nextLine();
        
        while(sc.hasNextLine()) {
            
            String a = sc.next();
            int b = sc.nextInt();
            
            if(a.equalsIgnoreCase("+")) {
                sum = sum.add(BigInteger.valueOf(b));
            }
            else if (a.equalsIgnoreCase("*")) {
                sum = sum.multiply(BigInteger.valueOf(b));
            }
            else {
                sum = sum.mod(BigInteger.valueOf(b));
            }
            sc.nextLine();
        }
        System.out.print(sum);
    }
}