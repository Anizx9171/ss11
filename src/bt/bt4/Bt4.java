package bt.bt4;
import java.util.*;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng từ: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        Stack<String> wordsStack = new Stack<>();

        for (int i = 0; i < count; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            wordsStack.push(word);
        }

        System.out.println("Các từ theo thứ tự đảo ngược:");
        while (!wordsStack.isEmpty()) {
            String word = wordsStack.pop();
            System.out.print(word + " ");
        }
    }
}
