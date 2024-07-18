package numeroPrimo;

public class Reto4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if(esPrimo(i)){
                System.out.println(i);
            }
        }
    }

    public static Boolean esPrimo(Integer a){
        if(a<2){
            return false;
        }
        for(int i = 2; i<a; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
