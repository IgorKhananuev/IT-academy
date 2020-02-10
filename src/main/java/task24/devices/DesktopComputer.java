package task24.devices;

public class DesktopComputer extends ElectricDevice {
    private String processorName;

    public DesktopComputer() {
    }

    public DesktopComputer(int weight, int voltage, int power) {
        super(weight,voltage,power);
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    @Override
    public void takeOn() {
        System.out.println(processorName + " switch on to a socket");
    }

    @Override
    public void takeOff() {
        System.out.println(processorName + " switch off from a socket");
    }
}

