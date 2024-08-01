package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;
public class SomaNumeros {
    private List<Integer> listNumeros;

    public SomaNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : listNumeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = -1;
        for (Integer numero: listNumeros){
            if (numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = listNumeros.get(0);
        for (Integer numero: listNumeros){
            if (numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return listNumeros;
    }
}
