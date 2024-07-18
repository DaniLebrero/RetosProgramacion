package sucesionFibonacci;

import java.util.ArrayList;
import java.util.List;

public class Reto3 {
    public static void main(String[] args) {
        fib(0,1);
    }

    private  static void fib(Integer numAnterior1,Integer numAnterior2){
        List<Integer> numeros = new ArrayList<>();
        Integer numActual;
        numeros.add(numAnterior1);
        numeros.add(numAnterior2);
        while (numeros.size()<50){

            numActual= numAnterior1 +numAnterior2;
            numAnterior1= numAnterior2;
            numAnterior2=numActual;
            numeros.add(numActual);
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
    }

}