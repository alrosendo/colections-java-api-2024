package streamApi.Desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerificarElementosDistintos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> conjunto = new HashSet<>();
        boolean numerosDistintos = numeros.stream()
                .allMatch(n -> conjunto.add(n));
        System.out.println("Todos os números são distintos: " + numerosDistintos);
    }

}
