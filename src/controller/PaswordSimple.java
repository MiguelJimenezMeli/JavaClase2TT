package controller;

public class PaswordSimple extends Password
{
    public PaswordSimple() {
        super("\\S{8,15}");
    }
}
