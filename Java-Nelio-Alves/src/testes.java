public class testes {
    public static void main(String[] args) {
        
        String s = "Batata Carne Hamburguer Pizza";

        String[] vect = s.split(" ");
        String word1 = vect[0]; 
        String word2 = vect[1];
        String word3 = vect[2];
        String word4 = vect[3];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        
    }
}
