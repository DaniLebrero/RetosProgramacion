package contandoPalabras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase para probar el programa:");
        cuentaPalabras(scanner.nextLine());

    }

    private static void cuentaPalabras(String s) {
        // Eliminar signos de puntuación y convertir a minúsculas
        var text = s.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

        // Dividir el texto en palabras
        String[] wordsArray =text.split("\\s+");

        // Contar la frecuencia de cada palabra
        Map<String, Integer> contPal = new HashMap<>();
        for (String word : wordsArray){
            if (contPal.containsKey((word))){
                contPal.put(word, contPal.get(word) + 1);
            }else{
                contPal.put(word,1);
            }
        }

        // Mostrar el recuento de palabras
        for(Map.Entry<String, Integer> entry: contPal.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
