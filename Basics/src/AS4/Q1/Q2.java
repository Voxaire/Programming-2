package AS4.Q1;
class Tommy {
    public void hit() {
        System.out.println("Hitting...");
    }
    public void run() {
        System.out.println("Running...");
    }
    public void fire() {
        System.out.println("Firing...");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Tommy tommy = new Tommy();
        tommy.hit();
        tommy.run();
        tommy.fire();
    }
}
