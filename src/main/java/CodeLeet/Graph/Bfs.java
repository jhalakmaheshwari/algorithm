package CodeLeet.Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Jhalak on 9/7/2017.
 */
public class Bfs {
    boolean[] visited;
    void bfsSearch(int s, LinkedList<Integer> adj[]){
        visited = new boolean[Graph.V];
        Arrays.fill(visited, false);

        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while(!queue.isEmpty()){
            s = queue.poll();
            System.out.println(s);
            Iterator<Integer> it = adj[s].listIterator();
            while(it.hasNext()){
                int val = it.next();
                if(!visited[val]){
                    visited[val] = true;
                    queue.add(val);
                }
            }
        }
    }
}
