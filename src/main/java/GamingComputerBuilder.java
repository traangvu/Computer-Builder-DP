public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    public void buildProcessor() { computer.setProcessor("Intel core i9"); }
    public void buildRAM() { computer.setRamSize(32); }
    public void buildHardDrive() { computer.setHardDrive("1 TB NVMe SSD"); }
    public void buildGraphicsCard() { computer.setGraphicsCard("NVIDIA RTX 4090"); }
    public void buildOperatingSystem() { computer.setOperatingSystem("Windows 11 pro"); }

    public Computer getComputer() { return computer; }
}
