public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector gamingDirector = new ComputerDirector(gamingBuilder);
        Computer gamingPC = gamingDirector.constructComputer();
        gamingPC.showConfiguration();

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector officeDirector = new ComputerDirector(officeBuilder);
        Computer officePC = officeDirector.constructComputer();
        officePC.showConfiguration();
    }
}
