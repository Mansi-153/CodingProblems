import java.util.*;
import java.util.Queue.*;
public class BFSGraph{
static final int V=7;
static void BFS(ArrayList<ArrayList<Integer>> graph){
    Queue<Integer> q = new ArrayDeque<>();
    boolean[] visited = new boolean[V];
    Arrays.fill(visited,false);
    
    q.add(2);
    visited[2]=true;
    
    while(true){
        int i=0;
        
        for(;i<V;i++){
            if(visited[i]==false)
            break;
            if(i==V-1)
            i=100;
        }
        if(i==100){
            while(!q.isEmpty())
            System.out.print(q.remove());
            return;
        }
        //System.out.print("udugciudusg");
        if(q.isEmpty())
        break;
        int c = q.remove();
        
        int j=0;
        while(j<graph.get(c).size()){
            if(visited[graph.get(c).get(j)]==false){
            q.add(graph.get(c).get(j));
            visited[graph.get(c).get(j)]=true;
            }
            
            j++;
        }
        System.out.print(c+" ");
        
    }
    
}

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> graph  = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) 
            graph.add(new ArrayList<Integer>()); 
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(2).add(0);
        graph.get(1).add(2);
        graph.get(3).add(3);
        graph.get(2).add(3);
        //graph.get(5).add(6);      
        BFS(graph);

    }
}