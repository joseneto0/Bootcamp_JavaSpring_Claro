package Desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio10 {
    //Agrupe os valores ímpares múltiplos de 3 ou de 5:
    //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosMultiplosTresCinco = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).toList();
        System.out.println(numerosMultiplosTresCinco);
    }
}
