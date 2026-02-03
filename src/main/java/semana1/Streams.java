package semana1;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lista.add(rand.nextInt(100));
        }
        System.out.println(lista);
        System.out.println(firstExcercise(lista));
    }
    public static List<Integer> firstExcercise(List<Integer> list){
        List<Integer> result = list.stream()
                .filter(x -> x >10)
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        return result;
    }

}

