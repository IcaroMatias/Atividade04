public class Main {
    public static void main(String[] args) {
        Banco cont1 = new Banco("Icaro Matias", 12345);
        cont1.exibirInformacoes();
        cont1.depositar(1000.00);
        cont1.exibirInformacoes();
        cont1.depositar(50.00);
        cont1.exibirInformacoes();

    }
}