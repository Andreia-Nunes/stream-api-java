import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int tamanhoLista = numeros.size();

        Optional<Integer> segundoMaiorNumero = numeros.stream()
                .sorted()
                .skip(tamanhoLista - 2)
                .min(Comparator.naturalOrder());

        System.out.printf("O segundo maior número da lista é %d\n", segundoMaiorNumero.get());
    }
}
