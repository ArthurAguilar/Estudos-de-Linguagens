package Aulas.App001;

public class comandosMath {
    public static void main(String[] args) {

        double w = 3.0;
        double a = 4.0;
        double s = -5.0;
        double j, k, l;

        j = Math.sqrt(w);
        k = Math.sqrt(a);
        l = Math.sqrt(25.0);

        System.out.printf("Raiz quadra de %f = %.2f%n", w, j);
        System.out.printf("Raiz quadra de %f = %.2f%n", a, k);
        System.out.printf("Raiz quadra de 25 = %.2f%n", l);
        System.out.println("****************************************");

        j = Math.pow(w, a);
        k = Math.pow(w, 2.0);
        l = Math.pow(5.0, 2.0);

        System.out.printf("%f elevado a %f = %.2f%n", w, a, j);
        System.out.printf("%f elevado a 2.0 = %.2f%n", w, k);
        System.out.printf("5.0 elevado a 2.0 = %.2f%n", l);
        System.out.println("****************************************");


        j = Math.abs(w);
        k = Math.abs(s);

        System.out.printf("Valor absoluto de %f = %f%n", w, j);
        System.out.printf("Valor absoluto de %f = %f", s, k);
    }
}
