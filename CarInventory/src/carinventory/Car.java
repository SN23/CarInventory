package carinventory;

/**
 * Car domain class
 * @author Sukhjinder
 */
public class Car {
    
    String vin;
    String make;
    String model;
    String year;
    String color;
    double Price;
    String weight;
    String driveTrain;
    String bodyStyle;
    String mileage;
    String fuelType;
    Engine engine;
    Transmission transmission;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    
    
    @Override
    public String toString(){
        return (("------------------------------Vehicle Specs------------------------------" + "\n" 
                + "VIN: " + this.getVin() + "\n"
                + "Make: " + this.getMake() + "\n"
                + "Model: " + this.getModel() + "\n"
                + "Year: " + this.getYear() + "\n"
                + "Color: " + this.getColor() + "\n"
                + "Price: $" + this.getPrice() + "\n"   
                + "Weight: "+this.getWeight() + "\n"        
                + "Drive train: " + this.getDriveTrain() + "\n"
                + "Body style: "+this.getBodyStyle() + "\n"
                + "Mileage: "+ this.getMileage() + "\n"
                + "Fuel Type: " +  this.getFuelType() + "\n"
                + "------------------------------Engine Specs------------------------------" + "\n"
                + "Engine Displacement: " + this.getEngine().getDisplacement() + "L" + "\n"
                + "Engine Number of Cylinders: " + this.getEngine().getNumOfCylinders() + "\n"
                + "Engine Horsepower: " + this.getEngine().getHorsepower() + "hp" + "\n"
                + "Engine Torque: " + this.getEngine().getTorque() + "ft-lbs" + "\n"
                + "---------------------------Transmission Specs----------------------------" + "\n"
                + "Type: " + this.getTransmission().getType() + "\n"
                + "Model: " + this.getTransmission().getModel() + "\n"
                + "Number of Gears: " + this.getTransmission().getNumOfGears()+ "\n" 
                + "------------------------------------------------------------------------") + "\n");
    }
    
}
