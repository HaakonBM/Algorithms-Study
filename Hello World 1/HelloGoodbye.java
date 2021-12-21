/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        String firstName = "";
        String secondName = "";
        if(args.length > 1) {
            secondName = args[1];
            firstName = args[0];
        }

        System.out.println("Hello " + firstName + " and " + secondName + ".\n" +
                "Goodbye " + secondName + " and " + firstName + ".");
    }
}
