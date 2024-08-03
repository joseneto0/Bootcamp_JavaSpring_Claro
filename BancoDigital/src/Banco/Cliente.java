package Banco;

public class Cliente {
    private String nome;
    private int agencia;

    public Cliente(String nome, int agencia) {
        this.nome = nome;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
