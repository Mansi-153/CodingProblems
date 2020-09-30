class NthNode{

    static Node head1;

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    void add(int data){
        if(head1==null)
        head1 = new Node(data);
        Node temp = head1;
        while(temp.next!=null)
        temp=temp.next;
        temp.next = new Node(data);
    }

    public int nthNode(Node head,int n){
        Node start = head;
        Node mid = head;
        int count=0;
        while(start.next!=null){
            count++;
            if(count>n-1){
                mid=mid.next;
            }
            start = start.next;
        }
        return mid.data;
    }

    public static void main(String[] args) {

        NthNode nth = new NthNode();
        nth.add(7);
        nth.add(9);
        nth.add(17);
        nth.add(92);
        nth.add(73);
        nth.add(69);
        System.out.println(nth.nthNode(head1,2));
        
    }


}