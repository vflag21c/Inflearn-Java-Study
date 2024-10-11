package collection.deque;

import java.util.Stack;

/**
 * Deque 사용 권장
 */
public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        //단순 조회
        System.out.println("stack.peek() = " + stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
