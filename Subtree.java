public class Subtree{

    static Node head;

    static class Node{
        int data;
        Node left ,right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    void search(Node node){
        if(node==null)
        return ;
        if(node.data==2){
        subt(node);
        return;}
        search(node.left);
        search(node.right);
        return ;
    }

    void subt(Node node){
        if(node==null)
        return;
        subt(node.left);
        if(node.data!=2)
        System.out.println(node.data);
        subt(node.right);
        return;

    }

    public static void main(String args[]){

        Subtree sub = new Subtree();
        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
        sub.search(head.left);


    }
}