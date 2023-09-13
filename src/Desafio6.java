import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 12);

        boolean contemMaiorQueDez = numeros.stream()
                .anyMatch(numero -> numero > 10);

        System.out.printf("A lista contém algum número maior que 10? %b\n", contemMaiorQueDez);
    }
}
