package models;

public class Circle {
    private double radius;
    private double circumference;
    private double area;

    public Circle() {}

    public Circle(double radius, double circumference, double area) {
        this.radius = radius;
        this.circumference = circumference;
        this.area = area;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadio() {
        return radius;
    }

    public void setRadio(double radio) {
        this.radius = radio;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
