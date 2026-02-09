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

        List<Usuario> usuarios = List.of(
                new Usuario("10000", "Juan", 21, true),
                new Usuario("10001", "Ana", 20, true),
                new Usuario("10002", "Pedro", 25, false),
                new Usuario("10003", "Laura", 22, true),
                new Usuario("10004", "Carlos", 30, false),
                new Usuario("10005", "Sofia", 19, true),
                new Usuario("10006", "Luis", 28, true)
        );

        System.out.println(ejercicio3(usuarios));
        System.out.println(ejercicio4(usuarios));


    }

    public static List<Integer> firstExcercise(List<Integer> list){
        List<Integer> result = list.stream()
                .filter(x -> x >10)
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList());
        return result;
    }
    public static List<String> secondExcercise(List<String> list){
        List<String> result = list.stream()
                .filter(x -> x.length() > 4)
                .map( x -> x.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        return result;
    }
    public static List<String> ejercicio3(List<Usuario> list){
        List<String> result = list.stream()
                .filter(u -> u.isActive())
                .map(u -> u.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        return result;

    }
    public static List<String> ejercicio4(List<Usuario> list){
        List<String> result = list.stream()
                .filter(u -> u.getAge() > 18)
                .map (u -> u.getNombre())
                .collect(Collectors.toList());
        return result;
    }
    public static List<String> ejercicio5(List<Transaction> list){

    }
}

