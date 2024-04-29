package Exercícios.Retangulo;

import java.util.Scanner;

import Exercícios.Retangulo.entities.Retangulo;

public class appRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        
        System.out.println("Digite a altura e a largura do triângulo: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.printf("Área: %.2f\n", retangulo.calcularArea());
        System.out.printf("Perímetro: %.2f\n", retangulo.calcularPerimetro());
        System.out.printf("Diagonal: %.2f\n", retangulo.calcularDiagonal());
        
        sc.close();
    }
}
