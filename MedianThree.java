import java.util.Scanner;
import java.util.Arrays;

public class MedianThree {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<loops; i++) {

            int[] array = new int [3];
            int index = 0;

            while(sc.hasNextInt() && index < 3) {
                array[index] = sc.nextInt();
                index++;
            }
            Arrays.sort(array);
            int output = array[1];
            System.out.printf("%d ",output);
        }
    }
}