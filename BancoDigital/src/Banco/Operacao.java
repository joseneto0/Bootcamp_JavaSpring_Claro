package Banco;

public class Operacao {
    private String tipo;
    private double quantia;

    public Operacao(String tipo, double quantia) {
        this.tipo = tipo;
        this.quantia = quantia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return "Banco.Operacao{" +
                "tipo='" + tipo + '\'' +
                ", quantia=" + quantia +
                '}';
    }
}
