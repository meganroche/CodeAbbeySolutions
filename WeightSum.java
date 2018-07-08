import java.util.Scanner;

public class WeightSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();

        for(int i=0; i<loops; i++){

            String numStr = Integer.toString(sc.nextInt());
            int length = numStr.length();
            int sum = 0;

            for(int j=0; j<length; j++) {

            sum = sum + Character.getNumericValue(numStr.charAt(j))*(j+1);
            }
            System.out.printf("%d ",sum);
        }
    }
}