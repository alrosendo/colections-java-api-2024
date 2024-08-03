package streamApi.Desafios;

import java.util.Arrays;
import java.util.List;

public class SomarDigitos {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
//        int somaDigitos = numeros.stream()
//                .map(n -> String.valueOf(n))
//                .flatMapToInt(num -> num.chars())
//                .map(c -> Character.getNumericValue(c))
//                .sum();
//        System.out.println(somaDigitos);

        int somaDigitos = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(String::chars)
                .map(Character::getNumericValue)
                .sum();
        System.out.println(somaDigitos);
    }
}
