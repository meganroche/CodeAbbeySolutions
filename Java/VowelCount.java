import java.util.Scanner;

public class VowelCount {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<loops; i++){

            String phrase = sc.nextLine();
            int count = (int)(phrase.length() - phrase.replaceAll("a|e|i|o|u|y","").length());
            System.out.printf("%d ",count);
        }
    }
}