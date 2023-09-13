import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0)
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(soma);
    }
}
