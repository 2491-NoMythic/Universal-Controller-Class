package frc.robot;

import java.util.HashMap;
/*
 * Top Face Button
 * Left Face Button
 * Right Face Button
 * Bottom Face Button
 * 
 * D-Pad N
 * D-Pad NE
 * D-Pad E
 * D-Pad SE
 * D-Pad S
 * D-Pad SW
 * D-Pad W
 * D-Pad NW
 * 
 * Left Stick Button
 * Right Stick Button
 * 
 * Left Bumper
 * Right Bumper
 * 
 * Left Trigger
 * Right Trigger
 * 
 * Power Button  
 * 
 * Mid Left Button
 * Mid Right Button
 * 
 * 21 Buttons in total
 */
public class ControllerTemplate{ 
    Controllers currentController;

    public enum Controllers{
        XBOX,
        PS4
    }

    public ControllerTemplate(){
        HashMap<String, Integer>  ButtonMap = new HashMap<String, Integer>(); 
        
        ButtonMap.put("Power Button", 1);
        ButtonMap.put("", 2); 
        ButtonMap.put("", 3);        
        ButtonMap.put("", 4);
        ButtonMap.put("", 5);
        ButtonMap.put("", 6);
        ButtonMap.put("", 7);
        ButtonMap.put("", 8);
        ButtonMap.put("", 9);
        ButtonMap.put("", 10);
        ButtonMap.put("", 11);
        ButtonMap.put("", 12);
        ButtonMap.put("", 13);
        ButtonMap.put("", 14);
        ButtonMap.put("", 15);
        ButtonMap.put("", 16);
        ButtonMap.put("", 17);
        ButtonMap.put("", 18);
        ButtonMap.put("", 19);
        ButtonMap.put("", 20);
        ButtonMap.put("", 21);     
        
    }
    /**
     * Sets the controller currently in use.
     * @param 
     */
    public void SetCurrentController(Controllers NewController){
        currentController = NewController;
    }
}