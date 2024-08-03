package Banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato - Banco.Conta Corrente");
        super.imprimirExtrato();
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", nome='" + nome + '\'' +
                '}';
    }
}
