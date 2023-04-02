package AS5;

interface basicanimal{
    void eat();
    void sleep();
}
class monkey{
    void jump() {
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}
class Human extends monkey implements basicanimal {
    @Override
    public void eat() {
        System.out.println("Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class Q2 {
        public static void main(String[] args) {
            Human human = new Human();
            monkey monkey = new monkey();
            human.eat();
            human.bite();
            monkey.bite();
            monkey.jump();
        }
    }

