package streamApi.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EncontrarMaiorNumeroPrimo {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional  maiorNumeroPrimo = numeros.stream()
                .filter(n -> isPrime(n))
                .max((a, b) -> a.compareTo(b));
        System.out.println("Maior número primo: " + maiorNumeroPrimo.get());
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



