public class ifElse {
    public static void main(String [] args) {
        int x = 20;
        int y = 55;

        if (x>y) { // If x is greater than Y the do the actions in the nest
            System.out.println("X is greater than Y");
        } else if (y>x) { // If the condition above is not met, it will read this condition, If Y is greater than X the do the actions in the nest
            System.out.println("Y is greater than X");
        } else { // If none of the above conditions have been met then do the actions in this loop.
            System.out.println("Y and X are equal.");
        }


    }
}
