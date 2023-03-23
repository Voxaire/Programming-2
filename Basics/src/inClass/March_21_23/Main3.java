package inClass.March_21_23;
class Phone{
    public void showTime(){
        System.out.println("The time is 8AM");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Main3 {
    public static void main(String[] args) {
     //   Phone obj = new Phone();
      //  SmartPhone smobj = new SmartPhone();
        Phone obj = new SmartPhone();
        obj.showTime();
        obj.on();
    }
}

