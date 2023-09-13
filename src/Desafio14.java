import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(numero -> {
                    for(int i = 2; i < numero; i++){
                        if(numero % i == 0){
                            return false;
                        }
                    }
                    return true;
                })
                .max(Comparator.naturalOrder());

        System.out.printf("O maior número primo é %d\n", maiorNumeroPrimo.get());
    }
}
