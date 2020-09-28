public class PrintMiddle {
static Node head;
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next=null;
        }
    }

    public int printMiddle(Node root){

        Node second = root;
        Node first = root;
        while(second.next!=null && second.next.next!=null){
            second=second.next.next;
            first=first.next;
        }
        return first.data;
    }

    public void add(int data){
        if(head==null){
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        temp = temp.next;
        temp.next = new Node(data);
    }

    public static void main(String[] args) {

        PrintMiddle pm = new PrintMiddle();
        pm.add(7);
        pm.add(5);
        pm.add(6);
        pm.add(1);
        System.out.println(pm.printMiddle(head));
        
    }
    
}