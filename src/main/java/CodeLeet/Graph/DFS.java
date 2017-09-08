package CodeLeet.Graph;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Jhalak on 9/8/2017.
 */
public class DFS {

    void dfsStack(int s, LinkedList<Integer> adj[]){
        boolean visited[] = new boolean[Graph.V];
        Arrays.fill(visited, false);
        Stack<Integer> stack= new Stack<Integer>();
        stack.push(s);
        visited[s]=true;
        System.out.println("DFS: ");
        while(!stack.isEmpty()){
            int val = stack.pop();
            System.out.print(val+"  ");
            Iterator<Integer> it = adj[val].iterator();
            while(it.hasNext()){
                int next = it.next();
                if(!visited[next]){
                    stack.push(next);
                    visited[next] = true;
                }
            }
        }
    }
    boolean visited[] = new boolean[Graph.V];
    void dfsRecursive(int s, LinkedList<Integer> adj[]){
        visited[s]=true;
        System.out.print(s+"  ");
        Iterator<Integer> it = adj[s].iterator();
        while(it.hasNext()){
            int next = it.next();
            if(!visited[next]){
                dfsRecursive(next, adj);
                visited[next] = true;
            }
        }
    }
}
