package carinventory;

/**
 * Engine domain class
 * @author Sukhjinder
 */
public class Engine {
    
    String VIN;
    String displacement;
    String numOfCylinders;
    String horsepower;
    String torque;
    String model;
    
    
    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getNumOfCylinders() {
        return numOfCylinders;
    }

    public void setNumOfCylinders(String numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }
}
