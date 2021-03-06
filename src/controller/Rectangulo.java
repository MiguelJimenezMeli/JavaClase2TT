package controller;

public class Rectangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    @Override
    public double area() {
        return base*altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
