package AS5;

interface basicanimal{
    void eat();
    void sleep();
}

class monkey{
    void jump() {

    }

    void bite(){
    }
}
class Human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("Eating");

    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");

    }
    public void speak() {
        System.out.println("Hello!!");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Human human = new Human();
        human.speak();
        human.eat();
        human.bite();
    }
}
