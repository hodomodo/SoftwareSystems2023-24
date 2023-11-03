package lab1;

abstract class Shape {
 
 protected int sides;
 
 public int getSides() {
 return sides;
 }

 public void setSides(int sides) {
 this.sides = sides;
 }
 
 abstract public int getArea();
 
 Shape(int sides) {
 this.sides = sides;
 }
}
