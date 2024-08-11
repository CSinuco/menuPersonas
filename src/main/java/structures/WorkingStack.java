package structures;

import java.util.Stack;

public class WorkingStack {
    public static void main(String[] args) {
        //Los stacks nos permiten crear de forma ordenada pero acceder solo al ultimo elemento de el stack
        Stack<Integer> stack = new Stack<>(); 
        stack.push(1);
        stack.push(2);
        stack.push(3);//ultimo elemento agregado 
        //Con este metodo miramos que hay en el stack sin borrarlo 
        System.out.println(stack.peek());
        //pop nos da el valor en top y lo elimina 
        System.out.println(stack.pop());
        System.out.println(stack.size());
        //vamos a re agregarlo
        System.out.println(stack.push(3));
        
    }
}
