/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Obituary
 */
public class Person {
    // abstract class + SSP create and instanciate object you can read and write to/from
    // 3 parameters, this: refers to the object that contains it, name: firstName, default value: ""
    private StringProperty firstName = new SimpleStringProperty(this, "firstName", ""); 

    
    // returns the String Property object itself 
    public StringProperty firstNameProperty() {
        return firstName;
    }
    
    // return the first name value (ie. "Bucky) traditional getter
    public String getFirstName(){
        return firstName.get();
    }
    
    // sets the first name value (ie. "Bucky) traditional setter
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    
    
    
}