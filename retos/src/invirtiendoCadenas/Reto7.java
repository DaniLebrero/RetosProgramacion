package invirtiendoCadenas;

import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena a invertir:");
        String cadena = scanner.nextLine();
        System.out.println(invertirCadena(cadena));
    }

    private static String invertirCadena(String cadena) {
        String res="";
        char[] listaLetras = cadena.toCharArray();
        for(int i =0;i<listaLetras.length;i++){
            res +=listaLetras[listaLetras.length-1-i];
        }
        return res;
    }
}
