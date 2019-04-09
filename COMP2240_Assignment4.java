/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2240_assignment4;

public class COMP2240_Assignment4 {

    public static void main(String[] args) {
    Circle myCircle = new Circle(1.5, "Blue");
    //System.out.println(myCylinder.toString());
    
    Cylinder myCyl = new Cylinder(2);
    Sphere mySph = new Sphere();
    System.out.println(myCyl.toString());
    
    //Practice Output
    mySph.getFract();
    System.out.println(mySph.toString());
    System.out.println(myCircle.toString());
    }
    
}
