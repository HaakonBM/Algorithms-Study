/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Percolation {

    public static void main(String[] args) {
        System.out.println("yes");
    }

    private int[][] grid;

    public Percolation(int n) {
        //Creates an n*n grid
        this.grid = new int[n][n];
    }
    public void open(int row, int col){
        //Opens site at colXrow if its not already open
    }
    public boolean isOpen(int row, int col){
        //is the site(col, row) open?
        return false;
    }
    public boolean isFull(int row, int col) {
        //returns number of open sites
        return false;
    }
    public int numberOfOpenSites() {
        //returns number of open sites
        return 0;
    }
    public boolean percolates() {
        //does the system percolate
        return false;
    }

}
