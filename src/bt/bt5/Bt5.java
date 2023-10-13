package bt.bt5;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bt5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bạn muốn kiểm tra");
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println("Chuỗi là palindrome");
        } else {
            System.out.println("Chuỗi không phải là palindrome");
        }
    }
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        StringBuilder reverseStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                queue.add(c);
                reverseStr.insert(0, Character.toLowerCase(c));
            }
        }

        while (!queue.isEmpty()) {
            if (Character.toLowerCase(queue.remove()) != reverseStr.charAt(0)) {
                return false;
            }
            reverseStr.deleteCharAt(0);
        }

        return true;
    }
}