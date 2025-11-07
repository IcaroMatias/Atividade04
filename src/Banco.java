public class Banco {
    // Criando atributos
    private String titular;
    private int numeroConta;
    private double saldo;

    // Construtor
    public Banco(String nomeTitular, int numeroConta) {
        this.titular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    // Métodos getters e setters
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.numeroConta;
    }

    // Métodos obrigatórios

    public void depositar(Double valor){
        System.out.println("----------------------------");
        if(valor <= 0) {
            System.out.println("Não foi possivel depositar este valor!");
        }else{
            System.out.println("Valor do depósito: "+ valor);
            System.out.println("Saldo após depósito: " + (this.saldo += valor));
        }
    }

    public void sacar(Double valor) {
        System.out.println("----------------------------");
        if(valor > this.saldo && this.saldo >= 0) {
            System.out.println("Valor de saque: " + valor);
            System.out.println("Saldo após saque: "+ (this.saldo -= valor));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirInformacoes () {
        System.out.println("----------------------------");
        System.out.println("Nome do titular: "+this.titular);
        System.out.println("Número da conta: "+this.numeroConta);
        System.out.println("Saldo atual: "+this.saldo);
        System.out.println("----------------------------");

    }


}
