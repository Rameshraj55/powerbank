import devices.Mobile;
import devices.PowerBank;

public class PowerbankDemo {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("MI",5000,70);
        Mobile mobile2 = new Mobile("POCO",5000,100);
        Mobile mobile3 = new Mobile("NI",5000,10);
        Mobile mobile4 = new Mobile("X",5000,50);
        PowerBank powerBank = new PowerBank();
        powerBank.connect(mobile1);
        System.out.println(powerBank.connect(mobile1));
        System.out.println(powerBank.connect(mobile2));
        System.out.println(powerBank.connect(mobile3));
        System.out.println(powerBank.connect(mobile4));
    }
}
