package sprint1_tasca3_ex1_n1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        List<Month> months = new ArrayList<>();
        
        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));

        // Inserir el mes d'agost en la seva posició correcta
        months.add(7, new Month("Agost"));
      
        // Demostrar que l'ArrayList manté l'ordre correcte
        System.out.println("Mesos en l'ArrayList:");
        for (Month month : months) {
            System.out.println(month);
        }

        // Convertir l'ArrayList en un HashSet
        Set<Month> monthSet = new HashSet<>(months);

        // Demostrar que no hi ha duplicats i mostrar l'ordre del HashSet
        System.out.println("\nMesos en el HashSet:");
        for (Month month : monthSet) {
            System.out.println(month);
        }

        // Recórrer la llista amb un for
        System.out.println("\nRecórrer el HashSet amb un for-each:");
        for (Month month : monthSet) {
            System.out.println(month);
        }

        // Recórrer la llista amb un iterador
        System.out.println("\nRecórrer el HashSet amb un iterador:");
        Iterator<Month> iterator = monthSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
