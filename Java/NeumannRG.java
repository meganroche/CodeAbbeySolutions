import java.util.Scanner;
import java.util.ArrayList;

public class NeumannRG {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();
        String s = "";

        for(int i=0; i<loops; i++){

            int initialVal = sc.nextInt(),a = initialVal,b = 0,numOfIter = 0,calc;
            boolean c = true;
            ArrayList<Integer> array = new ArrayList<Integer>();

            while(c){
                array.add(a);
                b = a;
                calc = a*a;
                String st = String.format("%08d",calc);
                String str = st.substring(2,6);
                a = Integer.valueOf(str);
                numOfIter++;
                boolean contains = array.contains(a);
                if(contains){
                    c = false;
                }
            }
            System.out.printf("%d ",numOfIter);
        }
    }
}