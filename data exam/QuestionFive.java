import java.util.Stack;

public class QuestionFive {
    public static String reverceStr(String inp) {
        Stack<Character> stack = new Stack<>();
        for (char c : inp.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
       
        String input = "SamuelTesfaye";
        String output = reverceStr(input);
        System.out.println("Reversed string: " + output);
    }
}
