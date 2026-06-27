public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 4080")
                .setBluetooth(true)
                .setWifi(true)
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage(512)
                .setGPU("Integrated Graphics")
                .setBluetooth(false)
                .setWifi(true)
                .build();

        System.out.println("Gaming PC");
        gamingPC.displayConfiguration();

        System.out.println("Office PC");
        officePC.displayConfiguration();
    }
}