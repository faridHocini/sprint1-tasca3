package sprint1_tasca3_ex3_n1;

import java.io.*;
import java.util.*;

public class CountriesQuiz {

    public static void main(String[] args) {
        HashMap<String, String> countriesMap = new HashMap<>();

        // Llegir el fitxer countries.txt i guardar les dades en el HashMap
        try (BufferedReader br = new BufferedReader(new FileReader("countries.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    countriesMap.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            System.err.println("Error llegint el fitxer: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el teu nom: ");
        String userName = scanner.nextLine();

        Random random = new Random();
        List<String> countries = new ArrayList<>(countriesMap.keySet());
        int score = 0;

        // Fer 10 preguntes aleatòries
        for (int i = 0; i < 10; i++) {
            String country = countries.get(random.nextInt(countries.size()));
            System.out.print("Quina és la capital de " + country + "? ");
            String answer = scanner.nextLine().trim();

            if (countriesMap.get(country).equalsIgnoreCase(answer)) {
                System.out.println("Correcte!");
                score++;
            } else {
                System.out.println("Incorrecte! La capital de " + country + " és " + countriesMap.get(country));
            }
        }

        // Guardar la puntuació de l'usuari en el fitxer classificacio.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("classificacio.txt", true))) {
            bw.write(userName + ": " + score + " punts");
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error escrivint al fitxer: " + e.getMessage());
        }

        System.out.println("Puntuació final: " + score + " punts");
        scanner.close();
    }
}


