package LAB_6;
public class WashingMachine {
    private boolean isOn;
    private int     noOfClothes;
    private String  detergent;

    // Switch on the machine
    public void switchOn() {
        isOn = true;
        System.out.println("Washing machine is ON.");
    }

    // Accept clothes -- returns the number of clothes
    public int acceptClothes(int noOfClothes) {
        this.noOfClothes = noOfClothes;
        System.out.println("Accepted " + noOfClothes + " clothes.");
        return this.noOfClothes;
    }

    // Accept detergent
    public void acceptDetergent(String detergent) {
        this.detergent = detergent;
        System.out.println("Detergent added: " + detergent);
    }

    // Switch off the machine
    public void switchOff() {
        isOn = false;
        System.out.println("Washing " + noOfClothes
                + " clothes with " + detergent + " is complete.");
        System.out.println("Washing machine is OFF.");
    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();

        wm.switchOn();
        int clothes = wm.acceptClothes(10);
        System.out.println("Number of clothes accepted: " + clothes);
        wm.acceptDetergent("Surf Excel");
        wm.switchOff();
    }
}