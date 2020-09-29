public class ReverseLinkList{

    static Node head;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next = null;
        }
    }

    void push(int data){
        Node temp = head;
        if(head==null)
        head = new Node(data);
        else{
            while(temp.next!=null)
            temp=temp.next;
            temp.next = new Node(data);

        }
    }

    Node reverse(Node h){
        Node first = head;
        Node  third = null;
        Node second = head;
        while(first!=null){
            second=first.next;            
            first.next=third;
            third=first;
            first=second;  
        }
        head = third;
        return head;
    }
    void print(){
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {

        ReverseLinkList r = new ReverseLinkList();
        r.push(4);
        r.push(41);
        r.push(42);
        r.push(43);
        r.reverse(head);
        r.print();
        
    }
}