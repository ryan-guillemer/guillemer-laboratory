import java.util.Scanner;


public class vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    public vehicle(String brand, int speed, String fuelType) {


        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo() {
     System.out.println("Brand: " + brand);
    System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

//  Car
class Kotse extends vehicle {
    private int numDoors;

    public Kotse(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

   
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Motor
class Motorsiklo extends vehicle {
    private boolean hasSidecar;

    public Motorsiklo(String brand, int speed, String fuelType, boolean hasSidecar) {
    super(brand, speed, fuelType);
    this.hasSidecar = hasSidecar;
    }


    public void displayInfo() {
    super.displayInfo();
    System.out.println("Has Sidecar: " + (hasSidecar ? "yes" : "no"));
    }
}

// TestVehicle 
class TestVehicle {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 
    
        System.out.print("Enter Car Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Fuel Type: ");
        String carFuelType = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int numDoors = scanner.nextInt();
        scanner.nextLine(); 

        
        

        // Input
       
        System.out.print("\nEnter Motorcycle Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.print("Speed: ");
        int motorcycleSpeed = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Fuel Type: ");
        String motorcycleFuelType = scanner.nextLine();
        System.out.print("Has Sidecar (yes/no): ");
        String sideCarInput = scanner.nextLine();
        boolean hasSidecar =sideCarInput.equals("yes");
        
        Kotse kotse = new Kotse(carBrand, carSpeed, carFuelType, numDoors);

        Motorsiklo motorcycle = new Motorsiklo(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);

        System.out.println("\nCar Details:");
        kotse.displayInfo();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();

       
        scanner.close();
    }
}   