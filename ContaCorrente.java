public class ContaCorrente {
    //Atributos  
    private double saldoIncial;
    private final String nomeCliente;

    //Construtor
    public ContaCorrente(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldoInicial= saldoInicial;
    }

    //Métodos
       public double consultarSaldo() {
       return saldo;

    }
  
     public void cancelarConta(String justificativa) {
       // deleteById(this.numeroConta); Metodo apenas para exemplo
         System.out.println("Sua conta foi cancelada com sucesso!!");
         System.out.println("Seu motivo -> " + justificativa);
     }
  

    public static void main(String[] args) {
		ContaCorrente minhaConta = new ContaCorrente(1000.0);

        double saldoAtual = minhaConta.consultarSaldo();
        System.out.println("Saldo atual: "+ saldoAtual);

    }

}



  

