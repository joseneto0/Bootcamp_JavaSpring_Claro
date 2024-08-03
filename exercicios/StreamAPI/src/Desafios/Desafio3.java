package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    //Desafio 3 - Verifique se todos os números da lista são positivos:
    //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 9, 5, 3);
        Boolean todosImpares = numeros.stream().allMatch(n -> n % 2 != 0);
        System.out.println(todosImpares);
    }
}
