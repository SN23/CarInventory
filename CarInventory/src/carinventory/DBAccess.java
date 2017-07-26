package carinventory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Sukhjinder
 */

public class DBAccess {
    
    private static Connection conn;
    private static final String QUOTE = "\"";  
    private static final Logger LOGGER = Logger.getLogger(DBAccess.class.getName());
    

    static {
        try {
            Handler fileHandler;
            fileHandler  = new FileHandler("./DBLog.log");
            fileHandler.setLevel(Level.ALL);
            LOGGER.addHandler(fileHandler);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            LOGGER.info("Logger Name: "+ LOGGER.getName());
        }
        
        catch (IOException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        catch (SecurityException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    
    /**
       * Inserts a Car into the database
       * @param car
       * @return inserts car into database (returns true)
       */
      public static Boolean addCar(Car car)
      {
          int result;
          String valueString = QUOTE + car.getVin() + QUOTE + "," 
            + QUOTE + car.getMake()+ QUOTE + ","
            + QUOTE + car.getModel() + QUOTE + "," 
            + QUOTE + car.getYear() + QUOTE + ","
            + QUOTE + car.getColor() + QUOTE + ","
            + QUOTE + car.getPrice() + QUOTE + ","
            + QUOTE + car.getWeight() + QUOTE + ","     
            + QUOTE + car.getDriveTrain() + QUOTE + ","
            + QUOTE + car.getBodyStyle() + QUOTE + ","
            + QUOTE + car.getMileage() + QUOTE + ","
            + QUOTE + car.getFuelType() + QUOTE ;
            
          String query=("insert into car (VIN, MAKE, MODEL, YEAR, COLOR, PRICE, WEIGHT, DRIVETRAIN, BODYSTYLE, MILEAGE, FUELTYPE) values (" + valueString + ")");
          System.out.println("addCar query is " + query);
          LOGGER.info("addCar query is = " + query);
                  
          try{
                conn = DBConnection.getMyConnection();
                Statement stmt = conn.createStatement();
                result = stmt.executeUpdate(query);
          }
          
          catch (SQLException sql){ 
                LOGGER.log(Level.SEVERE,"SQLException occured", sql);
                return false;
          }
          
          if (result==0)
             return false;
          else
              return true;
      }
      
      
      
      /**
       * Inserts a Engine into the database
       * @param engine engine
       * @return inserts engine into database (returns true)
       */
      public static Boolean addEngine(Engine engine)
      {
          int result;
          String valueString = QUOTE + engine.getVIN() + QUOTE + "," 
            + QUOTE + engine.getDisplacement()+ QUOTE + ","
            + QUOTE + engine.getNumOfCylinders()+ QUOTE + "," 
            + QUOTE + engine.getModel() + QUOTE + ","
            + QUOTE + engine.getHorsepower() + QUOTE + ","
            + QUOTE + engine.getTorque() + QUOTE;
            
          String query=("insert into engine (VIN, DISPLACEMENT, NUMOFCYLINDERS, MODEL, HORSEPOWER, TORQUE) values (" + valueString + ")");
          System.out.println("addEngine query is " + query);
          LOGGER.info("addEngine query is = " + query);
                  
          try{
                conn = DBConnection.getMyConnection();
                Statement stmt = conn.createStatement();
                result = stmt.executeUpdate(query);
          }
          catch (SQLException sql){
              LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;
          }
          
          if (result==0)
             return false;
          else
              return true;
      }
    
      
            /**
       * Inserts a transmission into the database
       * @param transmission transmission
       * @return inserts transmission into database (returns true)
       */
      public static Boolean addTransmission(Transmission transmission)
      {
          int result;
          String valueString = QUOTE + transmission.getVin()+ QUOTE + "," 
            + QUOTE + transmission.getType()+ QUOTE + ","
            + QUOTE + transmission.getModel()+ QUOTE + "," 
            + QUOTE + transmission.getNumOfGears() + QUOTE;
            
          String query=("insert into transmission (VIN, TYPE, MODEL, NUMOFGEARS) values (" + valueString + ")");
          System.out.println("InsertDeck query is " + query);
          LOGGER.info("InsertDeck query is = " + query);
                  
          try{
                conn = DBConnection.getMyConnection();
                Statement stmt = conn.createStatement();
                result = stmt.executeUpdate(query);
          }
          
          catch (SQLException sql){
              LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;
          }
          
          if (result==0)
             return false;
          else
              return true;
      }
}