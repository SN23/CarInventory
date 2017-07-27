//package carinventory;
//
//import java.util.ArrayList;
//import java.util.Scanner;
///**
// *
// * @author Sukhjinder
// */
//public class CarInventory {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        ArrayList<Car> cars = new ArrayList<>();
//        
//        String choice;
//        
////      Car Properties  
//        String vin;
//        String make;
//        String model;
//        String year;
//        String color;
//        double price;
//        String weight;
//        String driveTrain;
//        String bodyStyle;
//        String mileage;
//        String fuelType;
//        
////      Engine Properties
//        String displacement;
//        String numOfCylinders;
//        String engineModel;
//        String horsepower;
//        String torque;
//        
////      Transmission Properties
//        String type;
//        String transModel;
//        String numOfGears;
//        
//        Car car;
//        Engine engine;
//        Transmission transmission;
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Enter A to add a car to inventory");
//        System.out.println("Enter L to list inventory");
//        System.out.println("Enter E to exit");
//        
//        choice = scanner.nextLine();
//       
//        while(!(choice.equalsIgnoreCase("E"))){
//        
//            if(choice.equalsIgnoreCase("A")){
//            
//                System.out.println("Enter vin");
//                vin = scanner.nextLine();
//                
//                System.out.println("Enter car make");
//                make = scanner.nextLine();
//        
//                System.out.println("Enter car model");
//                model = scanner.nextLine();
//        
//                System.out.println("Enter car year");
//                year = scanner.nextLine();
//        
//                System.out.println("Enter car color");
//                color = scanner.nextLine();
//                
//                System.out.println("Enter Price");
//                price = Double.parseDouble(scanner.nextLine());
//                
//                System.out.println("Enter weight in lbs");
//                weight = scanner.nextLine();
//                
//                System.out.println("Enter drivetrain type");
//                driveTrain = scanner.nextLine();
//                
//                System.out.println("Enter body style");
//                bodyStyle = scanner.nextLine();
//                
//                System.out.println("Enter mileage");
//                mileage = scanner.nextLine();
//                
//                System.out.println("Enter fuel type");
//                fuelType = scanner.nextLine();
//                
//                System.out.println("Enter engine displacement");
//                displacement = scanner.nextLine();
//                
//                System.out.println("Enter number of cylinders");
//                numOfCylinders = scanner.nextLine();
//                
//                System.out.println("Enter model of Engine");
//                engineModel= scanner.nextLine();
//                
//                System.out.println("Enter engine horsepower");
//                horsepower = scanner.nextLine();
//                
//                System.out.println("Enter engine torque");
//                torque = scanner.nextLine();
//                
//                System.out.println("Enter transmission type");
//                type = scanner.nextLine();
//                
//                System.out.println("Enter transmission model");
//                transModel = scanner.nextLine();
//                
//                System.out.println("Enter number of gears");
//                numOfGears = scanner.nextLine();
//            
//                car = new Car();
//                engine = new Engine();
//                transmission = new Transmission();
//                
//                car.setVin(vin);
//                car.setMake(make);
//                car.setModel(model);
//                car.setYear(year);
//                car.setColor(color);
//                car.setPrice(price);
//                car.setWeight(weight);
//                car.setDriveTrain(driveTrain);
//                car.setBodyStyle(bodyStyle);
//                car.setMileage(mileage);
//                car.setFuelType(fuelType);
//                
//                engine.setDisplacement(displacement);
//                engine.setNumOfCylinders(numOfCylinders);
//                engine.setModel(engineModel);
//                engine.setHorsepower(horsepower);
//                engine.setTorque(torque);
//                engine.setVIN(vin);
//                
//                transmission.setType(type);
//                transmission.setModel(transModel);
//                transmission.setNumOfGears(numOfGears);
//                transmission.setVin(vin);
//               
//                car.setEngine(engine);
//                car.setTransmission(transmission);
//               
//                
//                cars.add(car);
//                
//                DBAccess.addCar(car);
//                DBAccess.addEngine(engine);
//                DBAccess.addTransmission(transmission);
//
//
//            }
//            
//            
//            if(choice.equalsIgnoreCase("D")){
//                
//                System.out.println("Enter VIN number of vehicle to be removed");
//                vin = scanner.nextLine();
//                
//                for(int i=0; i<cars.size(); i++){
//                    if(cars.get(i).getVin().equals(vin)){
//                        cars.remove(i);
//                    }
//                    
//                    else{
//                        System.out.println("Vehicle not found");
//                    }
//                }
//                
//            }
//            
//            if(choice.equalsIgnoreCase("L")){
//                
//                double totalInventoryValue = 0;
//                System.out.println("---------------Inventory---------------");
//                 
//                for(Car vehicle: cars){
//                    System.out.println("---Vehicle Specs---");
//                    System.out.println("VIN: " + vehicle.getVin());
//                    System.out.println("Make: " + vehicle.getMake());
//                    System.out.println("Model: " + vehicle.getModel());
//                    System.out.println("Year: " + vehicle.getYear());
//                    System.out.println("Color: " + vehicle.getColor());
//                    System.out.println("Price: $" + vehicle.getPrice());
//                    System.out.println("Weight: "+vehicle.getWeight());
//                    System.out.println("Drive train: " + vehicle.getDriveTrain());
//                    System.out.println("Body style: "+vehicle.getBodyStyle());
//                    System.out.println("Mileage: "+ vehicle.getMileage());
//                    System.out.println("Fuel Type: " +  vehicle.getFuelType());
//                    System.out.println("---Engine Specs---");
//                    System.out.println("Engine Displacement: " + vehicle.getEngine().getDisplacement() + "L");
//                    System.out.println("Engine Number of Cylinders: " + vehicle.getEngine().getNumOfCylinders());
//                    System.out.println("Engine Horsepower: " + vehicle.getEngine().getHorsepower() + "hp");
//                    System.out.println("Engine Torque: " + vehicle.getEngine().getTorque() + "ft-lbs");
//                    System.out.println("---Transmission Specs---");
//                    System.out.println("Type: " + vehicle.getTransmission().getType());
//                    System.out.println("Model: " + vehicle.getTransmission().getModel());
//                    System.out.println("Number of Gears: " + vehicle.getTransmission().getNumOfGears());
//                    
//             
//                    System.out.println("------------------------------------");
//                    
//                    totalInventoryValue += vehicle.getPrice();
//                }
//                
//                System.out.println("Total Inventory Value: $ " + totalInventoryValue);
//            }
//            
//            
//            
//            System.out.println("Enter A to add a car to inventory");
//            System.out.println("Enter D to delete a car to inventory");
//            System.out.println("Enter L to list inventory");
//            System.out.println("Enter E to exit");
//        
//            choice = scanner.nextLine();
//        }
//            
//    }   
//}