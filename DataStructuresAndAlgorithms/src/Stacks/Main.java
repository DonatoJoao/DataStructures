package Stacks;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        System.out.println("The stack is empty? " + stack.isEmpty());

        stack.push("João");
        stack.push("Pri");
        stack.push("Deus");
        stack.push("Jesus");
        System.out.println(stack.search("João"));
        System.out.println(stack.search("Pri"));
        System.out.println(stack.search("Deus"));
        System.out.println(stack.search("Jesus"));
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push("João");
        stack.push("Pri");
        stack.push("Deus");
        stack.push("Jesus");
        System.out.println(stack);
        String peek = stack.peek();
        System.out.println(peek);
        System.out.println("The stack is empty? " + stack.isEmpty());




    }
}
