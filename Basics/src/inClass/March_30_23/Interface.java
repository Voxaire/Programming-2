package inClass.March_30_23;

interface Bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn1();
    void blowHorn2();
}
class AvonCycle implements Bicycle, HornBicycle {
    void blowHorn(){
        System.out.println("Horn!!");
    }
    @Override
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    @Override
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    @Override
    public void blowHorn1() {
        System.out.println("Blow Horn 1");
    }
    @Override
    public void blowHorn2(){
        System.out.println("Blow Horn 2");
    }
    int a = 10;

}
public class Interface {
    public static void main(String[] args) {
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.applyBrake(1);
        System.out.println(avonCycle.a);
        avonCycle.a=750;
        System.out.println(avonCycle.a);
    }

}
