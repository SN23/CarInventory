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

        ArrayList<Car> cars = new ArrayList<Car>();
        String make;
        String model;
        String year;
        String color;
        String choice;
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
            
                System.out.println("Enter car make");
                make = scanner.nextLine();
        
                System.out.println("Enter car model");
                model = scanner.nextLine();
        
                System.out.println("Enter car year");
                year = scanner.nextLine();
        
                System.out.println("Enter car color");
                color = scanner.nextLine();
                
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
                
                engine.setDisplacement(displacement);
                engine.setNumOfCylinders(numOfCylinders);
                engine.setHorsepower(horsepower);
                engine.setTorque(torque);
        
                car.setEngine(engine);
                
                cars.add(car);
            }
            
            if(choice.equalsIgnoreCase("L")){
                
                System.out.println("---------------Inventory---------------");

                for(Car automobile: cars){
                    System.out.println("Make: " + automobile.getMake());
                    System.out.println("Model: " + automobile.getModel());
                    System.out.println("Year: " + automobile.getYear());
                    System.out.println("Color: " + automobile.getColor());
                    System.out.println("Engine Displacement: " + automobile.getEngine().getDisplacement());
                    System.out.println("Engine Number of Cylinders: " + automobile.getEngine().getNumOfCylinders());
                    System.out.println("Engine Horsepower: " + automobile.getEngine().getHorsepower());
                    System.out.println("Engine Torque: " + automobile.getEngine().getTorque());
                    System.out.println("------------------------------------");
                }
            }
            
            
            
            System.out.println("Enter A to add a car to inventory");
            System.out.println("Enter D to delete a car to inventory");
            System.out.println("Enter L to list inventory");
            System.out.println("Enter E to exit");
        
            choice = scanner.nextLine();
        }
            
    }   
}
