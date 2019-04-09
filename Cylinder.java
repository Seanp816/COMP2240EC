/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2240_assignment4;

public class Cylinder extends Circle {
    private double height;
    private String cyl;
    
    public Cylinder(double h){
        this.height = h;
    }
    public double Volume(){
        return super.area * height;
    }
    
    @Override
    public String toString(){
        cyl = "The area of the base of the cylinder is " + super.area +
              " and the height of the cylinder is " + height + ".";
    return cyl;
    }
}
