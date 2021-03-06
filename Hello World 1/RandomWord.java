/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;


public class RandomWord {
    public static void main(String[] args) {
        String randomSelectedWord = "";
        String championWord = "";
        int i = 1;
        while(!StdIn.isEmpty()) {
            randomSelectedWord = StdIn.readString();
            if(StdRandom.bernoulli(1.00/i)) {
                championWord = randomSelectedWord;
            }
            i++;
        }
        System.out.println(championWord);
    }
}
