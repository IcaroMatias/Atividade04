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
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public void exibirInformacoes () {
        System.out.println("Nome do titular: "+this.titular);
        System.out.println("Número da conta: "+this.numeroConta);
        System.out.println("Saldo atual: "+this.saldo);
    }


}
