/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class shortestpath {
    public static ArrayList<List<Integer>> answer = new ArrayList<>();
    // No. of vertices in graph
    private final int v;
 
    // adjacency list
    private ArrayList<Integer>[] adjList;
 
    // Constructor
    public shortestpath(int vertices)
    {
 
        // initialise vertex count
        this.v = vertices;
 
        // initialise adjacency list
        initAdjList();
    }
 
    // utility method to initialise
    // adjacency list
    @SuppressWarnings("unchecked")
    private void initAdjList()
    {
        adjList = new ArrayList[v];
 
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
 
    // add edge from u to v
    public void addEdge(int u, int v)
    {
        // Add v to u's list.
        adjList[u].add(v);
    }
 
    // Prints all paths from
    // 's' to 'd'
    public void printAllPaths(int s, int d)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
 
        // add source to path[]
        pathList.add(s);
 
        // Call recursive utility
        printAllPathsUtil(s, d, isVisited, pathList);
    }
 
    // A recursive function to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path
    private void printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList)
    {
 
        if (u.equals(d)) {
            answer.add(new ArrayList<>(localPathList));
            // if match found then no need to traverse more till depth

        }

 
        // Mark the current node
        isVisited[u] = true;
 
        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                // store current node
                // in path[]
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);

                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }
 
        // Mark the current node
        isVisited[u] = false;
    }
 
    // Driver program
    public static void main(String[] args)
    {
        // Create a sample graph
        shortestpath g = new shortestpath(16);
        g.addEdge(0, 1);
        g.addEdge(0, 5);
        g.addEdge(0, 7);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 6);
        g.addEdge(2, 3);
        g.addEdge(2, 13);
        g.addEdge(2, 11);
        g.addEdge(3, 10);
        g.addEdge(4, 6);
        g.addEdge(4, 10);
        g.addEdge(5, 6);
        g.addEdge(5, 12);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        g.addEdge(6, 15);
        g.addEdge(7, 9);
        g.addEdge(8, 10);
        g.addEdge(9, 12);
        g.addEdge(9, 15);
        g.addEdge(10, 14);
        g.addEdge(11, 13);
        g.addEdge(13, 14);
        g.addEdge(14, 15);
        System.out.print("Enter location of Titan: ");
        // arbitrary source
        int s = 0;
        Scanner in = new Scanner(System.in);
        
        // arbitrary destination
        int d = in.nextInt();
 
        System.out.println(
            "Best Paths:");
        g.printAllPaths(s, d);
        int shortestN = answer.get(0).size();//min # of nodes to complete path
        for (List<Integer> answer1 : answer) {
            if(shortestN > answer1.size()){
                shortestN = answer1.size();
            }
        }
        for(List<Integer> answer1 : answer){
            if(shortestN == answer1.size()){
                System.out.print(answer1.get(0));
                for(int i = 1; i < answer1.size(); i++){
                    System.out.print("-->" + answer1.get(i));
                    
                }
                System.out.println("");
            }
                
        }
    }
}
