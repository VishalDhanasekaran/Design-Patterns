public class HardDrive 
{
    public char[] read(long lba, int size) 
    {
        System.out.println("HardDrive reading " + size + " bytes from LBA: " + lba);
        return new char[size]; // Dummy data
    }
};
