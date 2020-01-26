package task24;

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
    void takeOn() {
        System.out.println(processorName + " switch on to a socket");
    }

    @Override
    void takeOff() {
        System.out.println(processorName + " switch off from a socket");
    }
}

