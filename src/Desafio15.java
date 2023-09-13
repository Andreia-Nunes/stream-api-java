import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean contemNegativo = numeros.stream()
                .anyMatch(numero -> numero < 0);

        System.out.printf("A lista contém números negativos? %b\n", contemNegativo);
    }
}
