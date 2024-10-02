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
        //This maps the buttons used in the code to their numerical keys, which are used for actually mapping controllers.  
        HashMap<String, Integer>  ButtonMap = new HashMap<String, Integer>(); 
        
        ButtonMap.put("Top Face Button", 1);
        ButtonMap.put("Left Face Button", 2); 
        ButtonMap.put("Right Face Button", 3);        
        ButtonMap.put("Down Face Button", 4);
        ButtonMap.put("D-Pad N", 5);
        ButtonMap.put("D-Pad NE", 6);
        ButtonMap.put("D-Pad E", 7);
        ButtonMap.put("D-Pad SE", 8);
        ButtonMap.put("D-Pad S", 9);
        ButtonMap.put("D-Pad SW", 10);
        ButtonMap.put("D-Pad W", 11);
        ButtonMap.put("D-Pad NW", 12);
        ButtonMap.put("Left Stick Button", 13);
        ButtonMap.put("Right Stick Button", 14);
        ButtonMap.put("Left Bumper", 15);
        ButtonMap.put("Right Bumper", 16);
        ButtonMap.put("Left Trigger", 17);
        ButtonMap.put("Right Bumper", 18);
        ButtonMap.put("Left Extra Button", 19);
        ButtonMap.put("Right Extra Button", 20);
        ButtonMap.put("Power Button", 21);     
        
    }
    /**
     * Sets the controller currently in use.
     * @param NewController: the controller.
     */
    public void SetCurrentController(Controllers NewController){
        currentController = NewController;
    }
}