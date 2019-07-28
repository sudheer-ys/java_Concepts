package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Siva {
	
	public static class Graph{
		int v;
		//Map<Integer, Integer> edges= new HashMap<Integer, Integer>();
		LinkedList<Integer> adj[];
		
		Graph(){}
		
		Graph(int n){
			this.v=n;
			adj= new LinkedList[n];
			for (int i=0; i<v; ++i)
	            adj[i] = new LinkedList();
		}
		
		void addEdge(int a,int b){
			adj[a].add(b);
			adj[b].add(a);
		}
		
		void printGraph(){
			
		}
		
		void connectedComponents(){
			boolean visited[] = new boolean[v];
			
			for(int i=0;i <v; i++){
				if(visited[i] == false){
					DFSUtil(i, visited);
					System.out.println();
				}
			}
			
		}
		
		void DFSUtil(int v, boolean visited[]){
			
			visited[v]=true;
			System.out.print(v);
			 
			Iterator<Integer> i = adj[v].listIterator();
			
			while(i.hasNext()){
				int n=i.next();
				if(!visited[n])
					DFSUtil(n, visited);
			}
			 
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(5);
		
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(2,4);
		
		g.connectedComponents();
		
		Graph g1= new Graph(4);
		g1.addEdge(0, 2);
		g1.addEdge(1, 3);
		
		//g1.connectedComponents();
	}

}