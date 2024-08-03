import Banco.Cliente;
import Banco.ContaCorrente;
import Banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente zezin = new Cliente("ze", 1234);
        ContaCorrente contaZezin = new ContaCorrente(zezin);
        Cliente netin = new Cliente("netin", 5678);
        ContaPoupanca contaNetin = new ContaPoupanca(netin);
        contaZezin.depositar(500);
        System.out.println();
        contaZezin.imprimirExtrato();
        contaZezin.sacar(200);
        System.out.println();
        contaZezin.imprimirExtrato();
        System.out.println();
        contaNetin.depositar(1000);
        System.out.println();
        contaNetin.imprimirExtrato();
        System.out.println();
        contaZezin.transferir(100, contaNetin);
        System.out.println();
        contaZezin.imprimirExtrato();
        System.out.println();
        contaNetin.imprimirExtrato();
    }
}