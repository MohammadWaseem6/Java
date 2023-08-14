package STACKS;

import java.util.ArrayList;

public class STACKSARRLIST {
    public static class STACK {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        STACK s = new STACK();
        s.push(10);
        s.push(20);
        s.push(30);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
