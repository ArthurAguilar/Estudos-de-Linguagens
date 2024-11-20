package Aulas.ClassesMetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Aulas.ClassesMetodosAbstratos.entities.Circle;
import Aulas.ClassesMetodosAbstratos.entities.Rectangle;
import Aulas.ClassesMetodosAbstratos.entities.Shape;
import Aulas.ClassesMetodosAbstratos.entities.enums.Color;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Quantas formas geométricas serão adicionadas? ");
        int totalShapes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < totalShapes; i++) {
            System.out.printf("Dados da #%dª forma: %n", i + 1);
            System.out.print("Retângulo ou Círculo (R/C)? ");

            while (true) {
                String shapeType = sc.nextLine();
                char firstChar = Character.toUpperCase(shapeType.charAt(0));

                if (firstChar == 'C' || firstChar == 'R') {
                    System.out.print("Cor (Preto - Azul - Vermelho): ");
                    Color color = Color.valueOf(sc.nextLine());

                    if (firstChar == 'C') {
                        System.out.print("Medida do Raio: ");
                        Double radius = sc.nextDouble();
                        sc.nextLine();

                        shapeList.add(new Circle(color, radius));
                        break;
                    } else {
                        System.out.print("Largura: ");
                        Double width = sc.nextDouble();
                        System.out.print("Altura: ");
                        Double height = sc.nextDouble();
                        sc.nextLine();

                        shapeList.add(new Rectangle(color, width, height));
                        break;
                    }
                } else {
                    System.out.println("Tente novamente - Retângulo ou Círculo (R/C)? ");
                }
            }
        }

        System.out.println();
        System.out.println("Área das Formas Geométricas: ");
        for (Shape shape : shapeList) {
            System.out.printf("%.2f", shape.area());
        }

        sc.close();
    }
}
