import java.util.ArrayList;
import java.util.List;

public class testingForEach {
    public static void main(String[] args) {
                
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        nums.forEach(num -> {
            System.out.println(num);
        });

        for (int i = 0; i < nums.size(); i++) {
            int numero = nums.get(i);
            System.out.println("Índice: " + i + ", Valor: " + numero);
        }
    }
}