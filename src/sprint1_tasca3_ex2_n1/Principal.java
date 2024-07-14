package sprint1_tasca3_ex2_n1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Principal {
    public static void main(String[] args) {
        // Crear i emplenar la primera llista
        List<Integer> firstList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            firstList.add(i);
        }

        // Mostrar la primera llista
        System.out.println("Primera llista:");
        for (Integer number : firstList) {
            System.out.println(number);
        }

        // Crear la segona llista
        List<Integer> secondList = new ArrayList<>();

        // Utilitzar ListIterator per recórrer la primera llista en ordre invers
        ListIterator<Integer> listIterator = firstList.listIterator(firstList.size());
        while (listIterator.hasPrevious()) {
            Integer element = listIterator.previous();
            secondList.add(element);
        }

        // Mostrar la segona llista
        System.out.println("\nSegona llista (ordre invers):");
        for (Integer number : secondList) {
            System.out.println(number);
        }
    }
}
