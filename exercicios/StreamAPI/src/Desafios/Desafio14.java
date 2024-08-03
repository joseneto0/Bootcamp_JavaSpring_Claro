package Desafios;

import java.util.List;
import java.util.Arrays;
import java.util.OptionalInt;

public class Desafio14 {
    //Encontre o maior número primo da lista:
    //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 104729);
        OptionalInt maiorPrimo = numeros.stream().mapToInt(Integer::intValue).filter(n -> {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (i <= 1){
                    return false;
                }
                if (n % i == 0){
                    return false;
                }
            }
            return true;
        }).max();
        System.out.println(maiorPrimo);
    }
}
