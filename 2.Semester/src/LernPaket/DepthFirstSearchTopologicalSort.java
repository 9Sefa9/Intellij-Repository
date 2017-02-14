package LernPaket;

import java.util.Stack;

import Algorithmen.Graph;

// 1. Einfache Stack<Integer> implementierung und initialisieren in dem Konstrukt
// 2. DIREKT nach dem Rekursiven aufruf, wir der jeweilige V wert eingepusht
public class DepthFirstSearchTopologicalSort {
          public boolean marked[];
          public Stack<Integer> reversePostorder;
	
          public DepthFirstSearchTopologicalSort(Graph G){
        	  marked = new boolean[G.V()];
        	  reversePostorder = new Stack<Integer>();
        	 
        	  for(int v = 0; v<G.V(); v++){
        		  if(!marked[v])
        		  dfs(G,v);
        	  }
          }
          public void dfs(Graph G, int v){
        	  marked[v] = true;
        	  for(int w: G.adj(v)){
        		  if(!marked[w])
        			  dfs(G,w);
        		  	  reversePostorder.push(v);
        	  }
          }
          public Iterable<Integer> reversePostOrder(){
        	  return reversePostorder;
          }
}
