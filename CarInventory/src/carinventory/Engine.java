/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinventory;

/**
 *
 * @author Sukhjinder
 */
public class Engine {
    
    
    String displacement;
    String numOfCylinders;
    String horsepower;
    String torque;

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
