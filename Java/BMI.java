import java.util.Scanner;
import java.lang.Math;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<loops; i++) {

            int weight = sc.nextInt();
            double height = sc.nextDouble();
            double BMI = weight / Math.pow(height,2.0);
            String BMIString;

            if(BMI < 18.5){
                BMIString = "under";
                System.out.printf("%s ",BMIString);
            }
            else if(BMI < 25.0){
                BMIString = "normal";
                System.out.printf("%s ",BMIString);
            }
            else if(BMI < 30.0){
                BMIString = "over";
                System.out.printf("%s ",BMIString);
            }
            else{
                BMIString = "obese";
                System.out.printf("%s ",BMIString);
            }
        }
        sc.close();
    }
}