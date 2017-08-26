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
        static final String MAKES= "makes";
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