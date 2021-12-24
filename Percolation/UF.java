/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    public static void main(String[] args) {
        System.out.println("Hello");
        int N = StdIn.readInt();
        UF uf = new UF(N);
  
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p,q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count + "Components");
    }
    private int[] id;
    private int count;

    private UF(int N) {
        //initialize N sites with integer names(0 to n-1)
        this.id = new int[N];
        this.count = 0;
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            count++;
        }
    }

    private void union(int p, int q) {
        //add connection between p and q
        int qPlaceholder = id[q];
        id[q] = id[p];
        count--;
        for(int i = 0; i < id.length; i++) {
            if(id[i] == qPlaceholder) {
                id[i] = id[p];
                count--;
            }
        }
    }

    private int find(int p) {
        //component indentifier for p(0 to n-1)
        return id[p];
    }

    private boolean connected(int p, int q) {
        //return true if p and q are in the same component
        return id[p] == id[q];
        //fasit find(p) == find(q)
    }

    private int count(){
        //number of components
        return count;
    }

}
