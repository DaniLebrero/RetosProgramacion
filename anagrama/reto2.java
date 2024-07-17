
import java.util.Arrays;

public class reto2 {

    public static void main(String[] args) {
        System.out.println(findAnagram("Amor","Roma"));
    }

    private static Boolean findAnagram(String string, String string2) {
        
        if(string.toLowerCase().equals(string2.toLowerCase())){
            return false;
        }else{
            char[]  wordOne = string.toLowerCase().toCharArray();
            Arrays.sort(wordOne);
            char[]  wordTwo = string2.toLowerCase().toCharArray();
            Arrays.sort(wordTwo);
            return  wordOne.equals(wordTwo);
        }
        
    }

}