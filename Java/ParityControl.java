import java.util.Scanner;

public class ParityControl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int i = sc.nextInt();
            String s = Integer.toBinaryString(i);
            int count = s.length() - s.replace("1", "").length();
            if(count % 2 == 0) {
                while(i>128){
                    i -= 128;
                }
                String output = Character.toString((char)i);
                System.out.printf("%s",output);
            }
        }
    }
}