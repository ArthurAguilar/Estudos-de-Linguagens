import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.println(numeros[i]);
        // }

        String[] letras = {
            "A", 
            "B", 
            "D", 
            "J", 
            "Z"
        };

        // for (int i = 0; i < letras.length; i++) {
        //     System.out.println(letras[i]);
        // }

        System.out.println(Arrays.toString(letras));
        System.out.println(Arrays.toString(numeros));

    }
}
