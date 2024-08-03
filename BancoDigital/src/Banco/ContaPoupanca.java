package Banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato - Banco.Conta Poupanca");
        super.imprimirExtrato();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", nome='" + nome + '\'' +
                '}';
    }
}
