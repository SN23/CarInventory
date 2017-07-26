package carinventory;

/**
 *
 * @author Sukhjinder
 */
public class Transmission {
    
    String vin; 
    String type;
    String model;
    String numOfGears;

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumOfGears() {
        return numOfGears;
    }

    public void setNumOfGears(String numOfGears) {
        this.numOfGears = numOfGears;
    }
    
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
            
}