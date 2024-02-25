class Hands {
    // creating 3 connectiomn types
    private ChargingCable usbMicroCable;
    private ChargingCable usbCCable;
    private ChargingCable lightningCable;
    private iPad ipad;

    public Hands(ChargingCable usbMicroCable, ChargingCable usbCCable, ChargingCable lightningCable, iPad ipad) {
        this.usbMicroCable = usbMicroCable;
        this.usbCCable = usbCCable;
        this.lightningCable = lightningCable;
        this.ipad = ipad;
    }

    public void tryCharging() { //where things get messy 
        // makes if statement with all the connection types + one invalid
        if (usbMicroCable.getConnectionType().equals(ipad.getConnectionType())) {
            ipad.setCurrentCharge(100);
            System.out.println("iPad is charging using USB Micro cable.");
        } else if (usbCCable.getConnectionType().equals(ipad.getConnectionType())) {
            ipad.setCurrentCharge(100);
            System.out.println("iPad is charging using USB-C cable.");
        } else if (lightningCable.getConnectionType().equals(ipad.getConnectionType())) {
            ipad.setCurrentCharge(100);
            System.out.println("iPad is charging using Lightning cable.");
        } else {
            System.out.println("No compatible cable found for charging the iPad.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        ChargingCable usbMicroCable = new ChargingCable("BrandA", 3, "USB Micro");
        ChargingCable usbCCable = new ChargingCable("BrandB", 5, "USB-C");
        ChargingCable lightningCable = new ChargingCable("BrandC", 4, "Lightning");
        iPad ipad = new iPad("Lightning", 0);
        Hands hands = new Hands(usbMicroCable, usbCCable, lightningCable, ipad);
        hands.tryCharging();
    }
}