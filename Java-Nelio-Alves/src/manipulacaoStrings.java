public class manipulacaoStrings {
    public static void main(String[] args) {
        
        String original = " AbcD eFgh iJKL MnoP QRst uvXYz      eF";
        String s01 = original.trim(); //Remove os espaços em branco nas laterais (extremidades)
        String s02 = original.toUpperCase(); //Tudo para maiusculko
        String s03 = original.toLowerCase(); //Tudo para minusculo
        String s04 = original.substring(4); //Vai iniciar uma string a partir do 4 elemento da original
        String s05 = original.substring(7, 15); //Vai iniciar uma string a partir do 7 até o 15
        String s06 = original.replace('i', 'Z'); //Replace = troca - Troca do I pelo Z (caracter pode aspas simples)
        String s07 = original.replace("bc", "sd"); //Replace = troca - troca BC por SD (string tem que ser aspas duplas)
        int s08 = original.indexOf("eF"); //Posição da primeira ocorrência da string "eF"
        int s09 = original.lastIndexOf("eF"); //Posição da última ocorrência da string "eF"

        System.out.printf("Original: %s\n", original);
        System.out.printf("Original Length: %s\n", original.length());
        System.out.printf("trim(): %s\n", s01);
        System.out.printf("trim() Length: %s\n", s01.length());
        System.out.printf("toUpperCase(): %s\n", s02);
        System.out.printf("toLowerCase(): %s\n", s03);
        System.out.printf("Substring(4): %s\n", s04);
        System.out.printf("Substring(7, 15): %s\n", s05);
        System.out.printf("Replace('i', 'A'): %s\n", s06);
        System.out.printf("Replace('bc', 'sd'): %s\n", s07);
        System.out.printf("IndexOf('eF'): %s\n", s08);
        System.out.printf("LastIndexOf('eF'): %s\n", s09);
    }
}
