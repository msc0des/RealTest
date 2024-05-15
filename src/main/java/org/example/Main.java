package org.example;

import java.util.*;

class Solution {
    private List<List<Integer>> adjList(int n,int [][]edges){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        return adj;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=adjList(n,edges);
        boolean visited[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination){
                return true;
            }

            for(int nearest:adj.get(curr)){
                if(!visited[nearest]){
                    visited[nearest]=true;
                    q.offer(nearest);
                }

            }
        }
        return false;
    }
}

class Main {
    public static void main(String args[]){
        Solution solution = new Solution();

        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int destination = 2;

        boolean result = solution.validPath(n, edges, source, destination);
        System.out.println("Can reach destination from source: " + result);
    }
}