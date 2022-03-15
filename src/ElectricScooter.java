public class ElectricScooter extends Vehicle
{
    private int batteryCapacity;

    public ElectricScooter(String name, int wheels, int batteryCapacity)
    {
        super(name, wheels);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public void playSpeaker()
    {
        System.out.println("Buzz buzz! Get outta the way!");
    }
}
