public class ContaCorrente {
    
	//Atributos  
    private double saldo;
    private final String nomeCliente;
    private String numeroAgencia;
	private int numeroConta;
	private String dataNascimento;
	
    
	//Construtor
    public ContaCorrente(String nomeCliente, double saldoInicial, String numeroAgencia, int numeroConta, String dataNascimento) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.dataNascimento = dataNascimento;
    }

    //Métodos
       public double consultarSaldo() {
       return saldo;
	   
    }
	
	public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido. O valor deve ser positivo.");
            return;
        }

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
	
	public void transferir(String nomeBeneficiario, String agenciaBeneficiario, String contaBeneficiario, double valorTransferencia){
		System.out.println("Transferencia realizada");
	}
  
     public void cancelarConta(String justificativa) {
       // deleteById(this.numeroConta); Metodo apenas para exemplo.
         System.out.println("Sua conta foi cancelada com sucesso!!");
         System.out.println("Seu motivo -> " + justificativa);
     }
  
  
	public int consultarExtrato (int numeroConta){
			System.out.println("Extrato da conta " + numeroConta);
		}
	
  
  
    // teste simulando consultar saldo via IDE.
    public static void main(String[] args) {
		ContaCorrente minhaConta = new ContaCorrente(1000.0);

        double saldoAtual = minhaConta.consultarSaldo();
        System.out.println("Saldo atual: "+ saldoAtual);

    }

}



  

