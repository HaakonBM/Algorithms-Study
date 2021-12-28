/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Percolation;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickUnionUF uf = new QuickUnionUF(N);
        System.out.println("Components: " + uf.count());

        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p,q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        System.out.println("Count: " + uf.count());
        //System.out.println("44 and 43 connected? " + uf.connected(44, 43));
        System.out.println("1 and 0 connected? " + uf.connected(9, 0));
        System.out.println("4 and 3 connected? true" + uf.connected(4, 3));
        System.out.println("3 and 8 connected? true" + uf.connected(3, 8));
        System.out.println("4 and 8 connected? true" + uf.connected(4, 8));

        //System.out.println(uf.connected(6,1));
        //System.out.println(uf.connected(3,6));



    }

    int[] id;
    int count;

    QuickUnionUF (int n) {
        this.id = new int[n];
        this.count = 0;
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            count++;
        }
    }
    private int root (int i) {
        while(id[i] != i) {
            i = id[i];
        }
        return i;
    }

    private int find (int p) {
        return id[p];
    }

    private void union (int p, int q) {
        if(root(p) == root(q)) {
            return;
        }
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
    private int find () {

        return 0;
    }
    private boolean connected (int p, int q) {
        boolean areConnected = root(p) == root(q);
        return areConnected;
    }
    private int count () {
        return count;
    }

}
