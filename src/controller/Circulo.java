package controller;

public class Circulo extends  FiguraGeometrica{

    private double radio;

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
}
