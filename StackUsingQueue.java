import java.util.*;
import java.util.Stack;

import java.util.Queue; 
public class StackUsingQueue{

    static int cur = -1;
    static Queue<Integer> q1 = new ArrayDeque<>(); 
    static Queue<Integer> q2 = new ArrayDeque<>(); 

    void push(int data){
        cur++;
        q1.add(data);

        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();

        }

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    int pop(){
        if(q2.isEmpty())
        return -1;

        int x =  q2.peek();
        q2.remove();
        cur--;
        return x;
        
    }
    void print(){
        while(!q2.isEmpty())
        {
            System.out.println(q2.peek());
            q2.remove();
        }
    }

   public static void main(String args[]) {

    Stack<Integer> st = new Stack<Integer>();
    
    st.push(9);
    st.push(7);
    System.out.println(st.pop());

        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(11);
        s.push(21);
        s.print();
        /*System.out.println(s.pop());
        System.out.println(s.pop());System.out.println(s.pop());System.out.println(s.pop());
        */
        
    }
}