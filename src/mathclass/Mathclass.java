/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathclass;

/**
 *
 * @author vifeh1685
 */
import java.text.*;
public class Mathclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double number = 682.233;
      DecimalFormat x= new DecimalFormat ("###.#");
      
      System.out.println(x.format(number));
    
      
      double y=2.241;
      double z=4.51;
      
      System.out.println(x.format(Math.pow(y, z)));
      //this is the Math.pow method ^
     
      
      System.out.println(x.format(Math.sqrt(56.847)));
      //The suqare root method ^       
  
      DecimalFormat a= new DecimalFormat("##.##");
      double pi=Math.PI;
      System.out.println(a.format(pi));
    }
    
}
