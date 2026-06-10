import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio2 {
    public  boolean esPalindormo(String texto1){
        Deque<Character> pila = new ArrayDeque<>();
        for(char letra : texto1.toCharArray()){
            pila.push(letra);

        }
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido+= pila.pop();
        }
        
        
        return invertido.equals(texto1);
    }
}
