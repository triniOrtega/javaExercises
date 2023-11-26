/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingactivities.objectoriented;

/**
 *
 * La clase Circle modela un circulo con radio y color
 */
public class Circle {

    private double radius = 1.0;
    private String color = "red";
    private final double pi;

    //constructor por defecto que incluye pi porque es una constante
    public Circle() {
        this.pi = 3.14;
    }

    //constructor con parametros
    public Circle(double radius) {
        this.pi = 3.14;
        this.radius = radius;
    }

    //para obtener el radio
    public double getRadius() {
        return radius;
    }

    //para obtener el area
    public double getArea() {
        return pi * radius * radius;
    }

    //obtiene la circunferencia
    public double getCircumference() {
        return pi * 2 * radius;
    }

    //para modificar el radio
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //metodo toString

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "My circle radius: " + radius
                + ", area: " + getArea()
                + ", circumference: " + getCircumference();
    }

}
