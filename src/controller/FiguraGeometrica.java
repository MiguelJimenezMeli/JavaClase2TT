package controller;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        return "El area de esta figura es: " + area();
    }
}
