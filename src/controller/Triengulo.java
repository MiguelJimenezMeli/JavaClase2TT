package controller;

public class Triengulo extends FiguraGeometrica{

    private double base;
    private double altura;

    @Override
    public double area() {
        return base*altura/2;
    }

    public Triengulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
