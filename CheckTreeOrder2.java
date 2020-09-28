class CheckTreeOrder2{

    static int po=4;

    static class Node{
        int data;
        Node left,right;
    } 

    static Node newNode(int val){
        Node temp = new Node();
        temp.data = val;
        temp.left=null;
        temp.right=null;
        return temp;
    }

    static int search(int[] in,int st,int end,int val){
        for(int i=0;i<=end;i++){
            if(val==in[i])
            return i;
        }
        return -1;
    }

    static Node build(int[] in,int[] post,int st,int end){
        Node node;
        if(st>end)
        return null;
        if(po>=0)
        node  = newNode(post[po--]);
        else
        return null;

        if(st==end)
        return node;

        int index = search(in, st, end, node.data);

        
        node.right = build(in,post,index+1,end);
        node.left = build(in,post,st,index-1);

        return node;

    }

    static int check(Node node,int[] pre,int index){
        if(node==null)
        return index;

        if(node.data==pre[index])
        index++;
        else
        return index;
        
        index = check(node.left,pre,index);

        index = check(node.right,pre,index);

        return index;

    }

    static void print(Node node){
        if(node==null)
        return;

        print(node.left);
        System.out.print(node.data+" ");
        print(node.right);
        return;

    }

    public static void main(String args[]) {
    int inOrder[] = {4, 2, 5, 1, 3};  
    int preOrder[] = {1, 2, 4, 5, 3};  
    int postOrder[] = {4, 5, 2, 3, 1};  
  
    int len = inOrder.length;  
  
 
    Node root = build(inOrder, postOrder, 0, len - 1);  
  
    
    int index = check(root,preOrder,0);  
  
    
    if (index == len)  
        System.out.println("Yes");  
    else
        System.out.println("No");  
        print(root);
  
    }
    


}