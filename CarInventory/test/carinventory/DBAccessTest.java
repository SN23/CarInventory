package carinventory;

import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 * JUNIT Test for DBAccess
 * @author Sukhjinder
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DBAccessTest {

    private static Car car;
    private static Engine engine;
    private static Transmission transmission;
    private static final String VIN = "BNR34000051000201";
    private static final String MAKE = "Nissan";
    private static final String MODEL = "GTR";
    private static final String YEAR = "1998";
    private static final String COLOR = "Bayside Blue";
    private static final Double PRICE = 50000.0;
    private static final String WEIGHT = "3146" ;
    private static final String DRIVETRAIN = "AWD" ;
    private static final String BODYSTYLE = "Coupe" ;
    private static final String MILEAGE = "35000" ;
    private static final String FUELTYPE = "Gas" ;
    private static final String DISPLACEMENT = "2.6" ;
    private static final String NUM_OF_CYLINDERS = "6" ;
    private static final String HORSEPOWER = "300" ;
    private static final String TORQUE = "266" ;
    private static final String ENGINE_MODEL = "RB26DETT" ;
    private static final String TRANS_TYPE = "Manual" ;
    private static final String TRANS_MODEL = "Getrag" ;
    private static final String NUM_OF_GEARS = "6" ;
    

    public DBAccessTest() {

    }
    
    @BeforeClass
    public static void setUpClass() {
        
        car = new Car();
        car.setVin(VIN);
        car.setMake(MAKE);
        car.setModel(MODEL);
        car.setYear(YEAR);
        car.setColor(COLOR);
        car.setPrice(PRICE);
        car.setWeight(WEIGHT);
        car.setDriveTrain(DRIVETRAIN);
        car.setBodyStyle(BODYSTYLE);
        car.setMileage(MILEAGE);
        car.setFuelType(FUELTYPE);
        
        engine = new Engine();
        engine.setVIN(VIN);
        engine.setDisplacement(DISPLACEMENT);
        engine.setNumOfCylinders(NUM_OF_CYLINDERS);
        engine.setHorsepower(HORSEPOWER);
        engine.setTorque(TORQUE);
        engine.setModel(ENGINE_MODEL);
        
        transmission = new Transmission();
        transmission.setVin(VIN);
        transmission.setType(TRANS_TYPE);
        transmission.setModel(TRANS_MODEL);
        transmission.setNumOfGears(NUM_OF_GEARS);
    }
    
    
    /**
     * Test of addCar method, of class DBAccess.
     */
    @Test
    public void testAddCar() {
        System.out.println("addCar");
        Boolean expResult = true;
        Boolean result = DBAccess.addCar(car);
        assertEquals(expResult, result);
    }

    /**
     * Test of addEngine method, of class DBAccess.
     */
    @Test
    public void testAddEngine() {
        System.out.println("addEngine");
        Boolean expResult = true;
        Boolean result = DBAccess.addEngine(engine);
        assertEquals(expResult, result);
    }

    /**
     * Test of addTransmission method, of class DBAccess.
     */
    @Test
    public void testAddTransmission() {
        System.out.println("addTransmission");
        Boolean expResult = true;
        Boolean result = DBAccess.addTransmission(transmission);
        assertEquals(expResult, result);
    }
    
   /**
     * Test of retrieveByVIN method, of class DBAccess.
     */
    @Test
    public void testRetrieveByVIN() {
        
        System.out.println("retrieveByVIN");
        Car result = DBAccess.retrieveByVIN(VIN);
        
        assertEquals(MAKE, result.getMake());
        assertEquals(MODEL, result.getModel());
        assertEquals(YEAR, result.getYear());
        assertEquals(COLOR, result.getColor());
        assertEquals(PRICE, result.getPrice(), 0.0);
        assertEquals(WEIGHT, result.getWeight());
        assertEquals(DRIVETRAIN, result.getDriveTrain());
        assertEquals(BODYSTYLE, result.getBodyStyle());
        assertEquals(MILEAGE, result.getMileage());
        assertEquals(FUELTYPE, result.getFuelType());
        
        assertEquals(VIN, result.getEngine().getVIN());
        assertEquals(DISPLACEMENT, result.getEngine().getDisplacement());
        assertEquals(NUM_OF_CYLINDERS, result.getEngine().getNumOfCylinders());
        assertEquals(HORSEPOWER, result.getEngine().getHorsepower());
        assertEquals(TORQUE, result.getEngine().getTorque());
//        assertEquals(ENGINE_MODEL, result.getEngine().getModel());
        assertEquals(VIN, result.getTransmission().getVin());
        assertEquals(TRANS_TYPE, result.getTransmission().getType());
//        assertEquals(TRANS_MODEL, result.getTransmission().getModel());
        assertEquals(NUM_OF_GEARS, result.getTransmission().getNumOfGears());
        
    }
    
    
       /**
     * Test of retrieveByVIN method, of class DBAccess.
     */
    @Test
    public void testRetrieveManufacturers() {
        
        System.out.println("retrieveManufacturers");
        ArrayList<String> result = DBAccess.retrieveManufacturers();
        
        assertEquals(MAKE, result.get(0));
 
    }
    
    
           /**
     * Test of retrieveByVIN method, of class DBAccess.
     */
    @Test
    public void testRetrieveNumOfManufacturersCars() {
        
        System.out.println("retrieveNumOfManufacturersCars");
        int result = DBAccess.retrieveNumOfManufacturersCars(MAKE);
        
        assertEquals(1, result);
    }

   /**
     * Test of updateCar method, of class DBAccess.
     */
    @Test
    public void testYUpdateCar() {
        System.out.println("updateCar");
       
        String newVIN = "BNR34111111111111";
        String make = "Infiniti";
        String model = "G35";
        String year = "2005";
        String color = "Blue";
        double price = 8500.0;
        String weight = "3900";
        String drivetrain = "RWD";
        String bodystyle = "Sedan";
        String mileage = "80000";
        String fuelType = "E85";
        String displacement = "3.5";
        String numOfCylinders = "6";
        String horsepower = "280";
        String torque = "270";
        String engineModel = "VQ35DE";
        String transType = "Automatic";
        String transModel = "G6";
        String numOfGears = "5";
        Boolean expResult = true;
        Boolean result = DBAccess.updateCar(VIN, newVIN, make, model, year, color, price, weight, drivetrain, bodystyle, mileage, fuelType, displacement, numOfCylinders, horsepower, torque, engineModel, transType, transModel, numOfGears);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteCar method, of class DBAccess.
     */
    @Test
    public void testZDeleteCar() {
        System.out.println("deleteCar");
        Boolean expResult = true;
        Boolean result = DBAccess.deleteCar("BNR34111111111111");
        assertEquals(expResult, result);
    }   
    
    
}