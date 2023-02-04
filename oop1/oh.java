package oop1;

public class oh {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.6);
        System.out.println(c1.toString() + "area = " + c1.getArea() + " and circumference is " + c1.getCircumference());
        System.out.println(c2.toString() + "area = " + c2.getArea() + " and circumference is " + c2.getCircumference());

    }
}
