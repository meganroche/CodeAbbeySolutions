import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loops = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<loops; i++){
            
            Stack<Character> stack = new Stack<Character>();
            String str = sc.nextLine();
            int loops2 = str.length();
            int x = 1;

            for(int j=0; j<loops2; j++){

                char c = str.charAt(j);

                if(c == '(' || c == '[' || c == '{' || c == '<') {
                    stack.push(c);
                }
                if(c == ')') {
                    if(stack.empty()){
                        x = 0;
                    }
                    else if(stack.peek() == '('){
                        stack.pop();
                    }
                    else {
                        x = 0;
                    }
                }
                else if(c == ']') {
                    if(stack.empty()){
                        x = 0;
                    }
                    else if(stack.peek() == '['){
                        stack.pop();
                    }
                    else {
                        x = 0;
                    }
                }
                else if(c == '}') {
                    if(stack.empty()){
                        x = 0;
                    }
                    else if(stack.peek() == '{'){
                        stack.pop();
                    }
                    else {
                        x = 0;
                    }
                }
                else if(c == '>') {
                    if(stack.empty()){
                        x = 0;
                    }
                    else if(stack.peek() == '<'){
                        stack.pop();
                    }
                    else {
                        x = 0;
                    }
                }
            }
            if(!stack.empty()) {
                x = 0;
            }
            System.out.printf("%d ",x);
        }
    }
}