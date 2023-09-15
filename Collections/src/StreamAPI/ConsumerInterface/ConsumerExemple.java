package StreamAPI.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemple {
    public static void main(String[] args) {
        // List de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> printNumberEven = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares
        numeros.forEach(printNumberEven);
    }
}
