import java.util.Arrays;
import java.util.List;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaDePares = numeros.stream()
                .filter(numero -> numero % 2 == 0).toList();

        List<Integer> listaDeImpares = numeros.stream()
                .filter(numero -> numero % 2 != 0).toList();

        System.out.println("Lista de números pares: " + listaDePares);
        System.out.println("Lista de números ímpares: " + listaDeImpares);
    }
}
