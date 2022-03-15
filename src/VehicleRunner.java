public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle myBicycle = new Bicycle("Citi Bike", 2, 10);
    System.out.println(myBicycle.getName());
    System.out.println(myBicycle.getWheels());
    System.out.println(myBicycle.getGearCount());
    myBicycle.move(50);
    myBicycle.turn(45);
    myBicycle.brake(0.75);
    myBicycle.ringBell();

    // testing all available methods on an ElectricScooter object
    ElectricScooter myScooter = new ElectricScooter("MiniMotors", 2, 250);
    System.out.println(myScooter.getName());
    System.out.println(myScooter.getWheels());
    System.out.println(myScooter.getBatteryCapacity());
    myScooter.move(60);
    myScooter.turn(81);
    myScooter.brake(0.8);
    myScooter.playSpeaker();
  }
}