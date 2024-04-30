package Aulas;
public class testes {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int[] numbers = {100, 200, 300, 400, 500};

        for (int nums : numeros) {
            System.out.print(nums+ " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
