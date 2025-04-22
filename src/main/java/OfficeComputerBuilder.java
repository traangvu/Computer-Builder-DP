public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    public void buildProcessor() { computer.setProcessor("Intel core i5"); }
    public void buildRAM() { computer.setRamSize(16); }
    public void buildHardDrive() { computer.setHardDrive("512 GB SSD"); }
    public void buildGraphicsCard() { computer.setGraphicsCard("Integrated graphics"); }
    public void buildOperatingSystem() { computer.setOperatingSystem("Windows 11 home"); }

    public Computer getComputer() { return computer; }
}
