public class ContaCorrente {
    //Atributos
    private final String nomeCliente;

    public ContaCorrente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    //Métodos
    public void cancelarConta(String justificativa) {
     // deleteById(this.numeroConta); Metodo apenas para exemplo
        System.out.println("Sua conta foi cancelada com sucesso!!");
        System.out.println("Seu motivo -> " + justificativa);
    }
}

