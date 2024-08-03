package streamApi.Desafios;

import java.util.Arrays;
import java.util.List;

public class VerificarNumeroNegativo {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean contemNegativo = numeros.stream()
                .anyMatch(n-> n < 0);
        if(contemNegativo) {
            System.out.println("a lista contem pelo menos um numero negativo");
        }else{
            System.out.println("a lista não contem numeros negativos");
        }
    }
}
