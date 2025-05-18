package app;

import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalcularAreaTriangulo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do triângulo X: %.4f%n" , areaX);
        System.out.printf("Área do triângulo Y: %.4f%n" , areaY);

        String maiorArea = areaX > areaY ? "Área maior: X" : "Área maior: Y";

        System.out.println(maiorArea);


        sc.close();
    }
}
