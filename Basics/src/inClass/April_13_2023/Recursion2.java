package inClass.April_13_2023;

public class Recursion2 {
    public static void fact(int n, int fact) {
        if (n==0) {
            System.out.println(fact);
            return;
        }
        fact *= n;
        fact(n-1,fact);
    }

    public static void main(String[] args) {
        fact(5,1);
    }
}
