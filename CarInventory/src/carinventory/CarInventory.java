package carinventory;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Sukhjinder
 */
public class CarInventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        
//      Car Properties  
        String vin;
        String make;
        String model;
        String year;
        String color;
        String choice;
        double price;
        
//      Engine Properties
        String displacement;
        String numOfCylinders;
        String horsepower;
        String torque;
        Car car;
        Engine engine;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter A to add a car to inventory");
        System.out.println("Enter L to list inventory");
        System.out.println("Enter E to exit");
        
        choice = scanner.nextLine();
       
        while(!(choice.equalsIgnoreCase("E"))){
        
            if(choice.equalsIgnoreCase("A")){
            
                System.out.println("Enter vin");
                vin = scanner.nextLine();
                
                System.out.println("Enter car make");
                make = scanner.nextLine();
        
                System.out.println("Enter car model");
                model = scanner.nextLine();
        
                System.out.println("Enter car year");
                year = scanner.nextLine();
        
                System.out.println("Enter car color");
                color = scanner.nextLine();
                
                System.out.println("Enter Price");
                price = Double.parseDouble(scanner.nextLine());
                
                System.out.println("Enter engine displacement");
                displacement = scanner.nextLine();
                
                System.out.println("Enter number of cylinders");
                numOfCylinders = scanner.nextLine();
                
                System.out.println("Enter engine horsepower");
                horsepower = scanner.nextLine();
                
                System.out.println("Enter engine torque");
                torque = scanner.nextLine();
                
            
                car = new Car();
                engine = new Engine();
                
                car.setMake(make);
                car.setModel(model);
                car.setYear(year);
                car.setColor(color);
                car.setPrice(price);
                car.setVin(vin);
                
                engine.setDisplacement(displacement);
                engine.setNumOfCylinders(numOfCylinders);
                engine.setHorsepower(horsepower);
                engine.setTorque(torque);
        
                car.setEngine(engine);
                
                cars.add(car);
            }
            
            
            if(choice.equalsIgnoreCase("D")){
                
                System.out.println("Enter VIN number of vehicle to be removed");
                vin = scanner.nextLine();
                
                for(int i=0; i<cars.size(); i++){
                    if(cars.get(i).getVin().equals(vin)){
                        cars.remove(i);
                    }
                    
                    else{
                        System.out.println("Vehicle not found");
                    }
                }
                
            }
            
            if(choice.equalsIgnoreCase("L")){
                
                double totalInventoryValue = 0;
                System.out.println("---------------Inventory---------------");
                 
                for(Car vehicle: cars){
                    System.out.println("VIN: " + vehicle.getVin());
                    System.out.println("Make: " + vehicle.getMake());
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Year: " + vehicle.getYear());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Price: $" + vehicle.getPrice());
                    System.out.println("Engine Displacement: " + vehicle.getEngine().getDisplacement() + "L");
                    System.out.println("Engine Number of Cylinders: " + vehicle.getEngine().getNumOfCylinders());
                    System.out.println("Engine Horsepower: " + vehicle.getEngine().getHorsepower() + "hp");
                    System.out.println("Engine Torque: " + vehicle.getEngine().getTorque() + "ft-lbs");
                    System.out.println("------------------------------------");
                    
                    totalInventoryValue += vehicle.getPrice();
                }
                
                System.out.println("Total Inventory Value: $ " + totalInventoryValue);
            }
            
            
            
            System.out.println("Enter A to add a car to inventory");
            System.out.println("Enter D to delete a car to inventory");
            System.out.println("Enter L to list inventory");
            System.out.println("Enter E to exit");
        
            choice = scanner.nextLine();
        }
            
    }   
}