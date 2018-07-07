import java.util.Scanner;
import java.util.Arrays;

public class Triangles {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int Loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < Loops; i++){

            int[] array = new int[3];

            while(sc.hasNextInt()){

                array[i] = sc.nextInt();
            }

            Arrays.sort(array);
            int a = array[0] + array[1];
            int b = array[2];

            if(a<b){
                System.out.printf("%d ",1);
            }
            else{
                System.out.printf("%d ",0);
            }
        }
            sc.close();
    }
}