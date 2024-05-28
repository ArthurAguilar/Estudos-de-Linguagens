package SalarioFuncionario;
import java.util.Scanner;
import SalarioFuncionario.entities.Salario;

public class appSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salario salario = new Salario();
    
        System.out.print("Nome: ");
        salario.nome = sc.nextLine();
        
        System.out.print("Salário bruto: ");
        salario.salarioBruto = sc.nextDouble();

        System.out.print("Taxa: ");
        salario.taxa = sc.nextDouble();

        System.out.println(salario.salarioLiquido());

        System.out.print("Quanto de porcentagem deseja acrescentar? ");
        double porcentagem = sc.nextDouble();

        System.out.println(salario.salarioAcrescido(porcentagem));
        
        sc.close();
    }
}
