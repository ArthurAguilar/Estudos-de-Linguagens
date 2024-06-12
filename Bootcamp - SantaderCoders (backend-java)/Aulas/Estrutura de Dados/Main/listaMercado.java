import java.util.Scanner;


public class listaMercado {
    public static void ListaMercado(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        do {
            System.out.println("Lista de Compras - Supermercado:");
            System.out.println("1. Adicionar item a lista ");
            System.out.println("2. Verificar lista ");
            System.out.println("3. Remover item da lista ");
            System.out.println("4. Sair do programa. ");
            System.out.println("Digite a opção desejada: [1, 2, 3, 4] ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual item deseja adicionar? ");
                    break;
                case 2: 
                    break;
                case 3:
                    System.out.println("Qual item desejar remover? ");
                    break;
                case 4: 
                    System.out.println("Saindo do programa...");
                    break;  
                default:
                    System.out.println("Opção inválida, tente novamente! ");          
            } 
        } while (opcao != 4);
        sc.close();
    }
}
