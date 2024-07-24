public class ComputerFactory 
{
    public static ComputerFacade bootComputer() //objects are created in factory method;
    {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        return new ComputerFacade(cpu, memory, hardDrive); 
    }
};
