package task24.devices;

public abstract class ElectricDevice {

    abstract void takeOn();

    abstract void takeOff();

    private int weight;
    private int voltage;
    private int power;

    public ElectricDevice() {
    }

    ;

    public ElectricDevice(int weight, int voltage, int power) {
        this.weight = weight;
        this.voltage = voltage;
        this.power = power;
    }

    public int getWeight() {
        System.out.print("Weight = ");
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVoltage() {
        System.out.print("Voltage = ");
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getPower() {
        System.out.print("Power = ");
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
