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
public class NHTSA_API {
    
    private static class Fields{
        static final String MODEL= "Model_Name";
    }
    
    public static ArrayList<String> getModels(String make){
                 
        String url = null;
        ArrayList<String> makes = new ArrayList<>();
        
        if(make!=null){
            StringBuilder builder = new StringBuilder();
            builder.append("https://vpic.nhtsa.dot.gov/api/vehicles/getmodelsformake/");
            try {
                builder.append(URLEncoder.encode(make, "UTF-8").replaceAll("\\+", "%20"));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(NHTSA_API.class.getName()).log(Level.SEVERE, null, ex);
            }
            builder.append("?format=json");
            url = (builder.toString());
            System.out.println(url);
        }
                
        try {
            makes = readUrl(url);
        } 
        catch (Exception ex) {
            Logger.getLogger(NHTSA_API.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return makes;
    }
    
    
    private static ArrayList<String> readUrl(String urlString) throws Exception {
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

        return parse(buffer.toString());
    } 
    
    finally {
        if (reader != null)
            reader.close();
        }
    }
    
    public static ArrayList<String> parse(String buffer){
        
        ArrayList<String> makes = new ArrayList<>();
        JSONObject cars = new JSONObject(buffer);
        JSONArray results = cars.getJSONArray("Results");
        for(int i=0; i<results.length(); i++){
            JSONObject carObj = results.getJSONObject(i);
            makes.add(carObj.getString(Fields.MODEL));
        }
        return makes;
    }
}
