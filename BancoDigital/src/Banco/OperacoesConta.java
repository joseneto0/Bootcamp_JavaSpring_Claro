package Banco;

public interface OperacoesConta {
    void sacar(double quantia) throws Exception;

    void depositar(double quantia);

    void transferir(double valor, Conta cliente) throws Exception;

    void imprimirExtrato();
}
