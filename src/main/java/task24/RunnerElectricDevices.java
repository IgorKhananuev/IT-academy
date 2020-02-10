package task24;

import task24.devices.DesktopComputer;
import task24.devices.NoteBook;

public class RunnerElectricDevices {

    public static void main(String[] args) {
        DesktopComputer atlon = new DesktopComputer();
        DesktopComputer celeron = new DesktopComputer(1, 220, 500);
        celeron.setProcessorName("Celeron");
        System.out.println(celeron.getProcessorName());
        atlon.setProcessorName("Atlon");
        System.out.println(atlon.getProcessorName());
        atlon.takeOn();
        atlon.takeOff();
        atlon.setPower(500);
        System.out.println(atlon.getPower());

        NoteBook asus = new NoteBook(1, 220, 350, 17, "Asus");
        asus.setPower(50);
        System.out.println(asus.getPower());
    }
}
