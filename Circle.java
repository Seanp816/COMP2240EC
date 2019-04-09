/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2240_assignment4;

public class Circle {
   // private fields
   public double radius;
   public double area;
   private String color;

   // Constructors
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }
   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }
   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }

   // Getters and Setters
   public double getRadius() {
      return this.radius;
   }
   public String getColor() {
      return this.color;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public void setColor(String color) {
      this.color = color;
   }

   // toString shows info about this circle
   @Override
   public String toString() {
      return String.format("Circle [radius = %.2f, color = %s]", radius, color);
   }

   // Return the area of this Circle
   public double getArea() {
      area = radius * radius * Math.PI;
      return area;
   }
}