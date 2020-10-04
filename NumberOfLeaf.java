class NumberOfLeaf{

    static Node head;
    static int k=0;
    
    static class Node{

        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    int count(Node node){
        if(node==null)
        return k;
        if(node.left==null && node.right==null)
        return k++;
        count(node.left);
        count(node.right);
        return k;
    }

    public static void main(String[] args) {

        NumberOfLeaf n = new NumberOfLeaf();
        /*head = new Node(1);
        head.left = new Node(2);
        head.left.left = new Node(3);
        head.left.left.left = new Node(4);
        head.right = new Node(5);
        //head.left.left.data = 2;
        head.right.left= new Node(9);
        head.left.right = new Node(21);
        head.right.right = new Node(12);*/
        head = new Node(1); 
        head.left = new Node(2); 
        head.right = new Node(3); 
        head.left.left = new Node(4); 
        head.left.right = new Node(5); 
        System.out.println(n.count(head));
        
    }
}