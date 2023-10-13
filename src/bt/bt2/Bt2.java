package bt.bt2;

import java.util.Scanner;
import java.util.Stack;

public class Bt2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi đầu vào");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']'){
                if (stack.isEmpty()) {
                    System.out.println("không có cặp ngoặc");
                    return;
                }
                char openBracket = stack.pop();
                if (!isMatchingBracket(openBracket, ch)){
                    System.out.println("không có cặp ngoặc");
                    return;
                }
            }
        }
        boolean check = stack.isEmpty();
        if (check){
            System.out.println("có các cặp ngoặc hợp lệ");
        }else System.out.println("không có cặp ngoặc");
    }
    private static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '"' && close == '"') ||
                (open == '[' && close == ']');
    }
}
