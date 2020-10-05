import java.util.*;
class LowestCommonAncestor{

    static Node head;
    static HashSet<Integer> hash = new HashSet<>();

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    int find(Node node,int val1,boolean b){
        int temp;
        if(node==null)
        return -1;

        if(node.data == val1 ||(temp=find(node.left,val1, b))!=-1 || (temp=find(node.right,val1, b))!=-1){
            if(b==true)
            hash.add(node.data);
            else
            if(hash.contains(node.data)){
            System.out.println(node.data);
            return -1;
            }

            return node.data;
        }
        return -1;

    }


    public static void main(String[] args) {

        LowestCommonAncestor l = new LowestCommonAncestor();
        head = new Node(1);
        /*head.left = new Node(2);
        head.left.left = new Node(3);
        head.left.left.left = new Node(4);
        head.right = new Node(5);
        //head.left.left.data = 2;
        head.right.left= new Node(9);
        head.left.right = new Node(21);
        head.right.right = new Node(12);*/
        head = new Node(20); 
        head.left = new Node(8); 
        head.right = new Node(22); 
        head.left.left = new Node(4); 
        head.left.right = new Node(12); 
        head.left.right.left = new Node(10); 
        head.left.right.right = new Node(14); 
        l.find(head,10,true);
        l.find(head,22,false);
        
    }
}