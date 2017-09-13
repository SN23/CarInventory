package carinventory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Sukhjinder
 */
public class Edmunds_API {
    
    private static class Fields{
        static final String NAME= "name";
        static final String MODELS= "models";
        static final String MODEL= "model";
        static final String MAKES= "makes";
        static final String MAKE= "make";
        static final String ENGINE= "engine";
        static final String CYLINDER= "cylinder";
        static final String SIZE= "size";
        static final String HORSEPOWER = "horsepower";
        static final String DRIVEN_WHEELS = "drivenWheels";
        static final String YEARS = "years";
        static final String YEAR = "year";
        static final String FUEL_TYPE = "type";
    }
    
    public static ArrayList<String> getMakes() {
                
        ArrayList<String> makes = new ArrayList<>();
        String url;
        StringBuilder builder = new StringBuilder();
        builder.append("https://api.edmunds.com/api/vehicle/v2/makes?view=basic&fmt=json&api_key=");
        builder.append(Config.API_KEY);
        url = (builder.toString());
        
        
        System.out.println(url);
        
        try {
           makes = parseMakes(readUrl(url));
        } 
        catch (Exception ex) {
            Logger.getLogger(Edmunds_API.class.getName()).log(Level.SEVERE, null, ex);
        }
        return makes;
    }
    
    
    public static ArrayList<String> parseMakes(String buffer) {
        
        ArrayList<String> makes = new ArrayList<>();
       
        JSONObject cars = new JSONObject(buffer);
        JSONArray carMakes = cars.getJSONArray(Fields.MAKES);
        for(int i=0; i<carMakes.length(); i++){
            JSONObject carObj = carMakes.getJSONObject(i);
            makes.add(carObj.getString(Fields.NAME));
        }
       
        return makes;
    }
    
    
    public static ArrayList<String> getModels(String make) {
                
        ArrayList<String> models = new ArrayList<>();
        String url;
        StringBuilder builder = new StringBuilder();
        builder.append("https://api.edmunds.com/api/vehicle/v2/");
        try {
            builder.append(URLEncoder.encode(make, "UTF-8").replaceAll("\\+", "%20"));
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Edmunds_API.class.getName()).log(Level.SEVERE, null, ex);
        }
        builder.append("/models?view=basic&fmt=json&api_key=");
        builder.append(Config.API_KEY);
        url = (builder.toString());
        
        
        System.out.println(url);
        
        try {
           models = parseModels(readUrl(url));
           System.out.println(models);
        } 
        catch (Exception ex) {
            Logger.getLogger(Edmunds_API.class.getName()).log(Level.SEVERE, null, ex);
        }
        return models;
    }
    
        public static ArrayList<String> parseModels(String buffer) {
        
        ArrayList<String> models = new ArrayList<>();
       
        JSONObject cars = new JSONObject(buffer);
        JSONArray carMakes = cars.getJSONArray(Fields.MODELS);
        for(int i=0; i<carMakes.length(); i++){
            JSONObject carObj = carMakes.getJSONObject(i);
            models.add(carObj.getString(Fields.NAME));
        }
       
        return models;
    }
        
        
        
        public static CarVINInfo getCarInfo(String vin) {
                
        CarVINInfo carVINInfo = new CarVINInfo();
        String url;
        StringBuilder builder = new StringBuilder();
        builder.append("https://api.edmunds.com/api/vehicle/v2/vins/");
        builder.append(vin);
        builder.append("?fmt=json&api_key=");
        builder.append(Config.API_KEY);
       
        url = (builder.toString());
        
        System.out.println(url);
        
        try {
           carVINInfo = parseCarInfo(readUrl(url));
        } 
        catch (Exception ex) {
            Logger.getLogger(Edmunds_API.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carVINInfo;
    }
    
        public static CarVINInfo parseCarInfo(String buffer) {
        
        ArrayList<String> carInfo = new ArrayList<>();
        CarVINInfo carVINInfo = new CarVINInfo();
       
        JSONObject car = new JSONObject(buffer);
        JSONObject carMake = car.getJSONObject(Fields.MAKE);
        String make = carMake.getString(Fields.NAME);
        
        JSONObject carModel = car.getJSONObject(Fields.MODEL);
        String model = carModel.getString(Fields.NAME);
        
        JSONObject engine = car.getJSONObject(Fields.ENGINE);
        int cylinderCount = engine.getInt(Fields.CYLINDER);
        double engineSize = engine.getDouble(Fields.SIZE);
        int horsepower = engine.getInt(Fields.HORSEPOWER);
        String fuelType = engine.getString(Fields.FUEL_TYPE);
        
        String drivetrain = car.getString(Fields.DRIVEN_WHEELS);
        
        JSONArray carYear = car.getJSONArray(Fields.YEARS);
        JSONObject yearObj = carYear.getJSONObject(0);
        int year = yearObj.getInt(Fields.YEAR);
        
        
        carVINInfo.setMake(make);
        carVINInfo.setModel(model);
        carVINInfo.setCylinderCount(Integer.toString(cylinderCount));
        carVINInfo.setEngineSize(Double.toString(engineSize));
        carVINInfo.setHorsepower(Integer.toString(horsepower));
        carVINInfo.setYear(Integer.toString(year));

        System.out.println("Make: " + make + "\n" +
                           "Model: " + model + "\n" +
                           "Cylinder Count: " +cylinderCount+ "\n" +
                           "Engine Size: " + engineSize + "\n" +
                           "Horsepower: " + horsepower + "\n" +
                           "Driven Wheels: " + drivetrain + "\n" +
                           "Year: " + year);
        
        return carVINInfo;
    }
    
    
    private static String readUrl(String urlString) throws Exception {
    BufferedReader reader = null;
    try {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
        conn.setRequestMethod("GET");
        conn.connect();
        
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder buffer = new StringBuilder();
        int read;
        char[] chars = new char[1024];
        while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 

        return buffer.toString();
    } 
    
    finally {
        if (reader != null)
            reader.close();
        }
    }

    
}