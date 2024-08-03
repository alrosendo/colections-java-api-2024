package streamApi.Desafios;

import java.util.Arrays;
import java.util.List;


public class VerificarNumerosIguais {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numerosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.get(0)));
        if (numerosIguais) {
            System.out.println("Números iguais");
        }else{
            System.out.println("nem todos os números são iguais");
        }




    }
}
