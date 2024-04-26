package Exercícios.iniciandoPOO;
import java.util.Locale;
import java.util.Scanner;

import Exercícios.iniciandoPOO.entities.Triangle;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite os lados do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        x.areaDoTriangulo();
        y.areaDoTriangulo();

        System.out.printf("Área do Triângulo X: %.4f%n", x.areaDoTriangulo());
        System.out.printf("Área do Triângulo Y: %.4f%n", y.areaDoTriangulo());

        if (x.areaDoTriangulo() > y.areaDoTriangulo()) {
            System.out.print("Maior área: X");
        } else {
            System.out.print("Maior área: Y");
        }

        sc.close();
    }
}
