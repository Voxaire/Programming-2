package Object_Oriented_Programming.computerObject;

public class PCObject {
    static class PC {
        String brand;
        String CPU;
        String GPU;
        double price;
        int storage;


        public PC(String brand, String CPU, String GPU, double price, int storage) {
            this.brand = brand;
            this.CPU = CPU;
            this.GPU = GPU;
            this.price = price;
            this.storage = storage;
        }
    }
}