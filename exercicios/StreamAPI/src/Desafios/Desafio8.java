package Desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio8 {
    //Desafio 8 - Somar os dígitos de todos os números da lista:
    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 99);
        int somaDigitosTotal = numeros.stream().flatMap(n -> Arrays.stream(n.toString().split(""))).mapToInt(Integer::parseInt).sum();
        System.out.println(somaDigitosTotal);
    }
}
