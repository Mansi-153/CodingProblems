class Tree1{
static Node root;
    public Tree1(){
        root = null;
    }
static class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data= data;
        left=null;
        right=null;
    }
}

public void post(Node node){

    if(node==null){
        return;
    }

    post(node.left);
    post(node.right);
    System.out.print(node.data+" ");

}
public void pre(Node node){

    if(node==null){
        return;
    }
    System.out.print(node.data+" ");
    pre(node.left);
    pre(node.right);
    

}
public void in(Node node){

    if(node==null){
        return;
    }

    in(node.left);
    System.out.print(node.data+" ");
    in(node.right);
    //System.out.print(node.data+" ");

}

    public static void main(String args[]){
        Tree1 tree = new Tree1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(8);

        tree.post(root);
        System.out.println();
        tree.pre(root);
        System.out.println();
        tree.in(root);


    }
}