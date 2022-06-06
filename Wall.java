import java.lang.*;
import java.util.*;

public class Wall{
    private List<List<Integer>> structure;
    
    Wall(List<List<Integer>> structure){
        this.structure=structure;
    }
    
    public static int weakest_link(Wall wall){
        java.util.HashMap <Integer, Integer> map=new java.util.HashMap<Integer, Integer>();
        int max=0, val=0;
        for (List <Integer> x:wall.structure){
            for (int v:x){
                map.put(v, map.getOrDefault(v, 0)+1);
                if (map.get(v)>max){
                    val=v;
                    max=map.get(v);
                }
            }
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of layers: ");
        int layers=Integer.parseInt(sc.nextLine().trim());
        List <List<Integer>> inp=new ArrayList<List<Integer>>();
        for (int i=1; i<=layers; i++){
            System.out.print("\nEnter brick edges of layer "+i+": ");
            String[] s=sc.nextLine().split(" ");
            List<Integer> vals=new ArrayList<Integer>();
            for (String c:s)
                vals.add(Integer.parseInt(c));
            inp.add(vals);
        }
        Wall wall=new Wall(inp);
        System.out.println(weakest_link(wall));
    }
}