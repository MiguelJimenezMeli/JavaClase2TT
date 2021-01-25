package controller;

import java.util.Scanner;

public class Main {

    private static void test_pass(String pwd, Password pass)
    {
        try { pass.setValue(pwd); }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        int key = 9;
        Scanner scanner = new Scanner(System.in);
        while (key != 0)
        {
            System.out.println("Hola, dime que ejercicio quieres ver [1,2] o [0] para salir");
            try { key = scanner.nextInt();}
            catch (Exception ex)
            {
                key = 9;
                scanner.next();
            }
            if (key == 1){ Ejercicio1();}
            else if (key == 2) { Ejercicio2();}
        }
        System.out.println("Adios");
    }

    private static void Ejercicio1() {
        Password pwd = new Password("\\S{8,15}");
        test_pass("01234567j", pwd);

        PaswordFuerte pwdF = new PaswordFuerte();
        PaswordIntermedia pwdI = new PaswordIntermedia();
        PaswordSimple pwdS = new PaswordSimple();

        test_pass("0123456789", pwdS);
        test_pass("0123456abc", pwdI);
        test_pass("0123456Abc", pwdF);
        System.out.println("Todo correcto");
    }

    private static void Ejercicio2() {
        Circulo c = new Circulo(10);
        Triengulo t = new Triengulo(6,8);
        Rectangulo r = new Rectangulo(2,7);
        FiguraGeometrica [] arr  = {c,t,r};
        System.out.println("El area promedio es: " + FiguraUtil.areaPromedio(arr));
    }
}
