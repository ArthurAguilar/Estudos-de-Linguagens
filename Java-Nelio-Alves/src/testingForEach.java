import java.util.Scanner;

public class testingForEach {
    public static void main(String[] args) {
                
        int[] numbers = {12, 23, 34, 45, 57};

        int index = 0;
        for (int number : numbers) {
            System.out.printf("Índice: %d Número: %d%n", index, number);;
            index++;
        }
    }
}
