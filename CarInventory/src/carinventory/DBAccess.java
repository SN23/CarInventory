package carinventory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            
          String query=("insert into engine (VIN, DISPLACEMENT, NUMOFCYLINDERS, ENGINE_MODEL, HORSEPOWER, TORQUE) values (" + valueString + ")");
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
            
          String query=("insert into transmission (VIN, TYPE, TRANSMISSION_MODEL, NUMOFGEARS) values (" + valueString + ")");
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
      
      
      
      /**
       * Builds a car object
       * If no car is created, will return null
       * If SQLException occurs, exception is logged (returns null)
       * @param rs a ResultSet
       * @return a created Car based on search parameters
       */
      private static Car buildCar(ResultSet rs)
      {       
         try{   
            
                String vin = rs.getString("VIN");
                String make = rs.getString("MAKE");
                String model= rs.getString("MODEL");
                String year = rs.getString("YEAR");
                String color = rs.getString("COLOR");
                double price = Double.parseDouble(rs.getString("PRICE"));
                String weight = rs.getString("WEIGHT");
                String driveTrain = rs.getString("DRIVETRAIN");
                String bodyStyle = rs.getString("BODYSTYLE");
                String mileage = rs.getString("MILEAGE");
                String fuelType = rs.getString("FUELTYPE");
                
                String displacement = rs.getString("DISPLACEMENT");
                String numOfCylinders = rs.getString("NUMOFCYLINDERS");
                String engineModel = rs.getString("ENGINE_MODEL");
                String horsepower = rs.getString("HORSEPOWER");
                String torque = rs.getString("TORQUE");
                
                String type = rs.getString("TYPE");
                String transModel = rs.getString("TRANSMISSION_MODEL");
                String numOfGears = rs.getString("NUMOFGEARS");
                
                Car car = new Car();
                Engine engine = new Engine();
                Transmission transmission = new Transmission();
                
                car.setVin(vin);
                car.setMake(make);
                car.setModel(model);
                car.setYear(year);
                car.setColor(color);
                car.setPrice(price);
                car.setWeight(weight);
                car.setDriveTrain(driveTrain);
                car.setBodyStyle(bodyStyle);
                car.setMileage(mileage);
                car.setFuelType(fuelType);
                
                engine.setDisplacement(displacement);
                engine.setNumOfCylinders(numOfCylinders);
                engine.setModel(engineModel);
                engine.setHorsepower(horsepower);
                engine.setTorque(torque);
                engine.setVIN(vin);
                
                transmission.setType(type);
                transmission.setModel(transModel);
                transmission.setNumOfGears(numOfGears);
                transmission.setVin(vin);
                
                car.setEngine(engine);
                car.setTransmission(transmission);
                
                return car;
         }
         catch(SQLException sql)
         {LOGGER.log(Level.SEVERE,"SQLException occured", sql);
         return null;}
         
      }
      
      
      
      /**
       * Builds a arrayList of cars
       * @param rs a ResultSet
       * @return ArrayList of added car(s)
       * @throws SQLException card not built
       */
      public static ArrayList<Car> buildCars(ResultSet rs) throws SQLException 
      {
         ArrayList<Car> cars = new ArrayList<>();
         Car car = buildCar(rs);
         cars.add(car);
         while(rs.next()){
             
              Car car1 = buildCar(rs);
              cars.add(car1);
         }
            return cars;
    } 
      
      
      
      /**
        * Deletes the selected car
        * If no car is deleted will return false
        * If SQLException occurs, exception is logged (returns false)
        * @param VIN deletes car based on VIN
        * @return deleted car from specified tables in query
        */
        public static Boolean deleteCar(String VIN)
         {

          int result1,result2,result3;
          
          String query1 = "delete from car where VIN= "+QUOTE+VIN+QUOTE;
          System.out.println("delete from car query= " + query1);
          LOGGER.info("delete from cars table query= " + query1);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt = conn.createStatement();
          result1 = stmt.executeUpdate(query1);
          }
          catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;}
              
//        Deletes car engine
          String query2 = "delete from engine where VIN= "+QUOTE+VIN+QUOTE;
          System.out.println("delete from engine table query= " + query2);
          LOGGER.info("delete from engine table query= " + query2);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt2 = conn.createStatement();
          result2 = stmt2.executeUpdate(query2);
          }
          catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;}
          
//        Deletes car transmission
          String query3 = "delete from transmission where VIN= "+QUOTE+VIN+QUOTE;
          System.out.println("delete from transmission table query= " + query3);
          LOGGER.info("delete from transmission table query= " + query3);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt3= conn.createStatement();
          result3 = stmt3.executeUpdate(query3);
          }
          catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;}
         
       
          
          if (result1 == 0 || result2==0 || result3==0)
              return false;
          else
              return true;
      }
      
        
          
     /**
       * Searches for a car by VIN
       * If SQLException is caught, exception is logged
       * If NumberFormatException is caught, returns false
       * @param VIN of car
       * @return ArrayList of cars
       */
        public static Car retrieveByVIN(String VIN) {
          
          Car car = new Car();
          String query = ("select car.*, engine.DISPLACEMENT, engine.NUMOFCYLINDERS, engine.ENGINE_MODEL, engine.Horsepower, engine.TORQUE, transmission.TYPE, transmission.TRANSMISSION_MODEL, transmission.NUMOFGEARS "
                  + "from car "
                  + "join engine on car.VIN = engine.VIN "
                  + "join transmission on car.VIN = transmission.VIN "
                  + "where car.VIN = "+QUOTE+ VIN + QUOTE);
          
          System.out.println("retrieveByVIN query= " + query);
          LOGGER.info("retrieveByVIN query= " + query);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(query);
          if (!rs.next())
              car = null;   //no matching car found
          else{
             car = buildCar(rs);
          }
          stmt.close();}
                catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);}
          
          return car;
      }   
        
        
        
    /**
       * Lists all the cars in the DB
       * If SQLException is caught, exception is logged
       * If NumberFormatException is caught, returns false
       * @param VIN of car
       * @return ArrayList of cars
       */
        public static ArrayList<Car> retrieveCars() {
          
          ArrayList<Car> cars = new ArrayList<>();
          String query = ("select car.*, engine.DISPLACEMENT, engine.NUMOFCYLINDERS, engine.ENGINE_MODEL, engine.Horsepower, engine.TORQUE, transmission.TYPE, transmission.TRANSMISSION_MODEL, transmission.NUMOFGEARS "
                  + "from car "
                  + "join engine on car.VIN = engine.VIN "
                  + "join transmission on car.VIN = transmission.VIN ");
          
          System.out.println("retrieveCars query= " + query);
          LOGGER.info("retrieveCars query= " + query);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(query);
          if (!rs.next())
              cars = null;   //no matching car found
          else{
             cars = buildCars(rs);
          }
          stmt.close();}
            catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);}
          
          return cars;
      }    
        
        
        
    /**
        * Updates the information on selected car
        * If no car is found will return false
        * If SQLException occurs, exception is logged (returns false)
        * @param VIN updates car based on VIN
        * @return updates car from specified tables in query
        */
        public static Boolean updateCar(String VIN, String newVIN, String make, String model, String year, String color, double price, String weight, String drivetrain, String bodystyle, String mileage, String fuelType, String displacement, String numOfCylinders, String horsepower, String torque, String engineModel, String transType, String transModel, String numOfGears)
        {

          int result1,result2,result3;
          
          String query1 = ("UPDATE car "
                  + "SET VIN =" + QUOTE + newVIN + QUOTE + ", MAKE =" + QUOTE + make + QUOTE + ", MODEL =" + QUOTE + model + QUOTE + ", YEAR =" + QUOTE + year + QUOTE + ", COLOR =" + QUOTE + color + QUOTE + ", PRICE =" +QUOTE+ price + QUOTE + ", WEIGHT =" + QUOTE + weight + QUOTE + ", DRIVETRAIN =" + QUOTE + drivetrain + QUOTE + ", BODYSTYLE =" + QUOTE + bodystyle + QUOTE + ", MILEAGE =" + QUOTE + mileage + QUOTE + ", FUELTYPE =" + QUOTE + fuelType + QUOTE 
                  + "WHERE VIN =" + QUOTE + VIN + QUOTE );
          System.out.println("update car query= " + query1);
          LOGGER.info("update car query= " + query1);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt = conn.createStatement();
          result1 = stmt.executeUpdate(query1);
          }
          catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;}
              
          String query2 = ("UPDATE engine "
                  + "SET VIN =" + QUOTE + newVIN + QUOTE + ", DISPLACEMENT =" + QUOTE + displacement + QUOTE + ", NUMOFCYLINDERS =" + QUOTE + numOfCylinders + QUOTE + ", ENGINE_MODEL=" + QUOTE + engineModel + QUOTE + ", HORSEPOWER =" + QUOTE + horsepower + QUOTE + ", TORQUE =" + QUOTE + torque + QUOTE 
                  + "WHERE VIN =" + QUOTE + VIN + QUOTE );
          System.out.println("update engine query= " + query2);
          LOGGER.info("update engine query= " + query2);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt2 = conn.createStatement();
          result2 = stmt2.executeUpdate(query2);
          }
          catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;}
          
          String query3 = ("UPDATE transmission "
                  + "SET VIN =" + QUOTE + newVIN + QUOTE + ", TYPE =" + QUOTE + transType + QUOTE + ", TRANSMISSION_MODEL =" + QUOTE + transModel + QUOTE + ", NUMOFGEARS =" + QUOTE + numOfGears + QUOTE 
                  + "WHERE VIN =" + QUOTE + VIN + QUOTE );
          System.out.println("delete from transmission table query= " + query3);
          LOGGER.info("delete from transmission table query= " + query3);
          try{
          conn = DBConnection.getMyConnection();
          Statement stmt3= conn.createStatement();
          result3 = stmt3.executeUpdate(query3);
          }
          catch (SQLException sql)
              {LOGGER.log(Level.SEVERE,"SQLException occured", sql);
              return false;}
         
       
          
          if (result1 == 0 || result2==0 || result3==0)
              return false;
          else
              return true;
      }    
}