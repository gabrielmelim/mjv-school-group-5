public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        saldo = saldoInicial;
    }

    public double consultarSaldo() {
        return saldo;

    }
    public static void main(String[] args) {
		ContaCorrente minhaConta = new ContaCorrente(1000.0);

        double saldoAtual = minhaConta.consultarSaldo();
        System.out.println("Saldo atual: "+ saldoAtual);


    }

}


