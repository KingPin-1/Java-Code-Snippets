import java.util.*;

// Check alternate rank one below --> this one has get connected components counter in-built
// class UnionFind {
//     List<Integer> parent = new ArrayList<>();
//     List<Integer> size = new ArrayList<>();
//     int cnt;
//     public UnionFind(int n){        // Constructor
//         cnt = n;
//         for( int i = 0 ; i <= n ; i++ ) {
//             parent.add(i);
//             size.add(1);
//         }
//     }
//     public int find(int u){
//         if( u == parent.get(u) )
//             return u;
//         int ultimate_parent = find(parent.get(u));
//         parent.set(u,ultimate_parent);
//         return ultimate_parent;
//     }
    
//     public void union(int u , int v){
//         int ult_u = find(u);
//         int ult_v = find(v);
//         if( ult_v == ult_u )
//             return;
//         if( size.get(ult_v) < size.get(ult_u) ) {
//             parent.set(ult_v, ult_u);
//             size.set(ult_u,size.get(ult_u) + size.get(ult_v));
//         }
//         else{
//             parent.set(ult_u, ult_v);
//             size.set(ult_v,size.get(ult_u) + size.get(ult_v));
//         }
//         cnt--;
//     }
    
//     public int getComponents(){
//         return cnt;
//     } 
// }


class UnionFind {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public UnionFind(int n){        // Constructor
        for( int i = 0 ; i <= n ; i++ ) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findParent(int u){
        if( u == parent.get(u) )
            return u;
        int ultimate_parent = findParent(parent.get(u));
        parent.set(u,ultimate_parent);
        return ultimate_parent;
    }
    public void unionByRank(int u , int v){
        int ult_u = findParent(u);
        int ult_v = findParent(v);
        if( ult_v == ult_u )
            return; // same parent --> same component --> no union needed
        if( rank.get(ult_v) < rank.get(ult_u) ) {
            parent.set(ult_v, ult_u);
        }
        else if( rank.get(ult_v) > rank.get(ult_u) ){
            parent.set(ult_u,ult_v);
        }
        else{
            parent.set(ult_v,ult_u); // equal ranks --> doesnt matter which gets selected as parent;
            int ult_rank = rank.get(ult_u);
            rank.set(ult_u,ult_rank+1);
        }
    }
    
    public void unionBySize(int u , int v){
        int ult_u = findParent(u);
        int ult_v = findParent(v);
        if( ult_v == ult_u )
            return;
        if( size.get(ult_v) < size.get(ult_u) ) {
            parent.set(ult_v, ult_u);
            size.set(ult_u,size.get(ult_u) + size.get(ult_v));
        }
        else{
            parent.set(ult_u, ult_v);
            size.set(ult_v,size.get(ult_u) + size.get(ult_v));
        }
    }
}

public class DisjointSetUnion {
    public static void main(String[] args) {
        UnionFind ds = new UnionFind(7);
        // main for bySize
        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);
        if( ds.findParent(3) == ds.findParent(7) )
            System.out.println("Same Component");
        else
            System.out.println("Not same");
            ds.unionBySize(3,7);
        if( ds.findParent(3) == ds.findParent(7) )
            System.out.println("Same Component");
        else
            System.out.println("Not same");
        System.out.println(ds.parent +" -> " + ds.size);

        // main for byRank
        // ds.unionByRank(1,2);
        // ds.unionByRank(2,3);
        // ds.unionByRank(4,5);
        // ds.unionByRank(6,7);
        // ds.unionByRank(5,6);
        // if( ds.findParent(3) == ds.findParent(7) )
        //     System.out.println("Same Component");
        // else
        //     System.out.println("Not same");
        //     ds.unionByRank(3,7);
        // if( ds.findParent(3) == ds.findParent(7) )
        //     System.out.println("Same Component");
        // else
        //     System.out.println("Not same");
        // System.out.println(ds.parent +" -> " + ds.rank);
    }
}
