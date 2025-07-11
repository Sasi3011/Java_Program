class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is running safely");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();
        Vehicle v2 = new Bike();
        v2.run();
    }
}
