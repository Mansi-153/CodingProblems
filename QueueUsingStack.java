import java.util.Stack;
public class QueueUsingStack{


    static int cur=-1;
    static Stack<Integer> st1 = new Stack<Integer>();
    static Stack<Integer> st2 = new Stack<Integer>();

    void add(int data){
        while (!st1.isEmpty()) 
        {  
            st2.push(st1.pop());  
            //s1.pop();  
        }  
  
        // Push item into s1  
        st1.push(data);  
  
        // Push everything back to s1  
        while (!st2.isEmpty())  
        {  
            st1.push(st2.pop());  
            //s2.pop();  
        }  

    }
    int peek(){
        if(st1.isEmpty())
        return -1;
        int x = st1.pop();
        st1.push(x);
        cur--;
        return x;

    }
    boolean remove(){
        if(st2.isEmpty())
        return false;
        
        cur--;
        return true;

    }
    public static void main(String args[]) {

    
            QueueUsingStack s = new QueueUsingStack();
            s.add(1);
            s.add(2);
            s.add(11);
            s.add(21);
            s.add(44);
            System.out.println(s.peek());
            //System.out.println(s.pop());System.out.println(s.pop());System.out.println(s.pop());
               
        }
}