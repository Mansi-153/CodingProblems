class SumOfNodes{

    static Node head;
    static int k=0;

    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        } 
    
    }
    int sum(Node node){
        if(node==null)
        return 0;
        sum(node.left);
        sum(node.right);
        k+=node.data;
        return k;
    }

    public static void main(String[] args){
        SumOfNodes s = new SumOfNodes();
        head  = new Node(1);
        head.left = new Node(2);
        head.left.left = new Node(3);
        head.left.left.left = new Node(4);
        head.right = new Node(5);
        //head.left.left.data = 2;
        head.right.left= new Node(9);
        head.left.right = new Node(21);
        head.right.right = new Node(12);

        System.out.println(s.sum(head));

    }
}