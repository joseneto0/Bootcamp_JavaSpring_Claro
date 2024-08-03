package Banco;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements OperacoesConta{

    private static int NUMERO_UNICO = 1;

    protected int agencia;
    protected String nome;
    protected double saldo = 0;
    protected int numero;
    protected List<Operacao> listaOperacoesRealizadas;


    public Conta(Cliente cliente){
        this.nome = cliente.getNome();
        this.agencia = cliente.getAgencia();
        this.numero = NUMERO_UNICO++;
        this.listaOperacoesRealizadas = new ArrayList<>();
    }

    @Override
    public void sacar(double quantia) throws Exception {
        if (quantia > saldo){
            throw new Exception("Saldo Insuficiente");
        } else {
            System.out.println("Saque Efetuado com Sucesso");
            saldo -= quantia;
            listaOperacoesRealizadas.add(new Operacao("Saque", quantia));
        }

    }

    @Override
    public void depositar(double quantia) {
        saldo += quantia;
        System.out.println("Deposito Realizado com Sucesso");
        listaOperacoesRealizadas.add(new Operacao("Deposito", quantia));
    }

    @Override
    public void transferir(double valor, Conta cliente) throws Exception {
        if (valor > saldo){
            throw new Exception("Saldo insuficiente");
        } else {
            saldo -= valor;
            cliente.saldo += valor;
            cliente.listaOperacoesRealizadas.add(new Operacao("Deposito-" + nome, valor));
            listaOperacoesRealizadas.add(new Operacao("Transferencia-" + cliente.nome, valor));
        }
    }

    @Override
    public void imprimirExtrato() {
        for (Operacao operacoes: listaOperacoesRealizadas){
            System.out.println(operacoes);
        }
        System.out.println();
        System.out.println("Saldo Atual: " + saldo);
    }


}
