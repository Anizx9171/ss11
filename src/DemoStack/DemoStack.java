package DemoStack;

import java.util.ArrayList;
import java.util.List;

public class DemoStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
    }
   static class Stack {
        private List<Integer> list = new ArrayList<>();

        public void push(Integer integer) {
            list.add(integer);
        }

        public Integer pop() {
            Integer peek = list.remove(list.size() - 1);
            list.remove(peek);
            return peek;
        }

        public Integer peek() {
            return list.remove(list.size() - 1);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public boolean isEmpty2() {
            return list.isEmpty();
        }

    }
}
