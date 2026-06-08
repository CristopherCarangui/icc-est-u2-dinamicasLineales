import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Ejercicio1 {
    ///
    /// Metodo que devuelve una cadena de 
    /// texto invertido 
    /// texto -> Computacion
    /// return -> noicatupmoc
    /// Usando solo pilas
    /// 
    public String invertString( String texto){
        Deque<Character> pila = new ArrayDeque<>();
        Stack <Character> l = new Stack<>();
        for(char letra : texto.toCharArray()){
            pila.push(letra);

        }
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido+=pila.pop();

            
        }

        return invertido;
    }
}
