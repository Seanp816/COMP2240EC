/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2240_assignment4;
import java.lang.Math;
/**
 *
 * @author seanwhitaker
 */
public class Sphere extends Circle {
    
    public double v;
    private float fract;
    
    public float getFract(){
    fract = 4/3;
    return this.fract;
    }
    
    public double getVolume(){
        //fract = 4 / 3;
        v = fract * Math.PI * radius * radius * radius;
        return v;
    }
    
    public String toString(){
    return "The volume of the sphere is " + v ;
    }
}







