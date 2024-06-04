import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 5, 6, 8, 9);

        Stream<?> st1 = list.stream().map(p -> p * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        Integer sum = list.stream().reduce(0, (x, y) -> (x + y));
        System.out.println("SUM:  "+ sum);

        List<Integer> st3 = list.stream()//criando um stream a partir da lista
                .filter(x -> x% 2 == 0)//filtrando os valores pares
                .map(x -> x * 100)//multiplicando os valores pares por 100
                .collect(Collectors.toList());//coletando os valores em uma lista

        System.out.println(Arrays.toString(st3.toArray()));
    }
}