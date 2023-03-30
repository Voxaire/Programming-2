package inClass.March_30_23;
interface sampleInterface{
    void meth1();
    void meth2();
}

interface childsampleInterface extends sampleInterface{
  void meth3();
  void meth4();
}

class mySampleClass implements childsampleInterface{

    @Override
    public void meth1() {
        System.out.println("Meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth 2");

    }

    @Override
    public void meth3() {
        System.out.println("Meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("Meth 4");
    }
}
public class inhert_Interface {
    public static void main(String[] args) {
        mySampleClass sampleClass = new mySampleClass();
        sampleClass.meth1();
    }
}
