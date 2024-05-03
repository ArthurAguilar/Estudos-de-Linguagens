package Banco.entities;

public class acoesBancarias {

    public int numConta;
    public String nomeTitular;
    private double contaBancaria;
    
    public acoesBancarias(int numConta, String nomeTitular, double contaBancaria) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.contaBancaria = contaBancaria;
    }

    public acoesBancarias(int numConta, String nomeTitular){
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void depositarValor(double valorDepositado){
        this.contaBancaria += valorDepositado;
    }

    public void sacarValor(double valorSacado) {
        if (valorSacado <= contaBancaria) {
            this.contaBancaria -= (valorSacado + 5); 
        } else {
            System.out.printf("Valor insuficiente para saque. Você possui apenas R$%.2f\n", contaBancaria);
        }
    }

    public void mostrarConta() {
        System.out.printf("\nNúmero da conta: %d - Nome do Titular: %s - Valor Bancário: R$%.2f\n", this.numConta, this.nomeTitular, this.contaBancaria);
    }


    
    
    


}
