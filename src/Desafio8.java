import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .flatMapToInt(numero -> String.valueOf(numero).chars())
                .map(numero -> Character.getNumericValue(numero))
                .sum();

        System.out.println(somaDigitos);

    }
}
