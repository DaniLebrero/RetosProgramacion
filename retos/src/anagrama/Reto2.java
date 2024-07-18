package anagrama;

import java.util.Arrays;

public class Reto2 {

    public static void main(String[] args) {

        System.out.println(findAnagram("Amor","Roma"));
        System.out.println(findAnagram("amor", "amores")); // false
        System.out.println(findAnagram("amor", "amor")); // false
    }

    private static Boolean findAnagram(String string, String string2) {
        
        if(string.equalsIgnoreCase(string2)){
            return false;
        }
        // Convierte las palabras a arrays de caracteres
        char[] caracteres1 = string.toLowerCase().toCharArray();
        char[] caracteres2 = string2.toLowerCase().toCharArray();

        // Ordena los arrays de caracteres
        Arrays.sort(caracteres1);
        Arrays.sort(caracteres2);

        // Compara los arrays ordenados
        return Arrays.equals(caracteres1, caracteres2);
        
    }

}