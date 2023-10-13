package bt.bt1;

import java.util.LinkedList;
import java.util.Queue;

public class Bt1 {
    public static void main(String[] args) {
        String[] inputList = {"A", "B", "C", "D", "E"};

        Queue<String> queue = new LinkedList<>();

        for (String element : inputList) {
            queue.offer(element);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
