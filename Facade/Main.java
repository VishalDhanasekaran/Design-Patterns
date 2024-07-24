public class Main 
{
    public static void main(String args[]) 
    {
        ComputerFacade computer = ComputerFactory.bootComputer();
        computer.start();
    }
};
