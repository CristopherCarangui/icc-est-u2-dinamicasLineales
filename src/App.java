import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       runLinkedlist();
       runQueue();
       runStack();
       System.out.println("Ejercicio en clase");
       Ejercicio1 ejercicio1 = new Ejercicio1();
       String texto = "COMPUTACION".toLowerCase();
       System.out.println("Texto original: " +  texto);
       String invertido = ejercicio1.invertString(texto);
       System.out.println(invertido);
       System.out.println("Ejercicio 2 Practica");
       Ejercicio2 ejercicio2 = new Ejercicio2();
       String texto1 = "ORURO".toLowerCase();
       System.out.println("Texto original: "  +  texto1);
       boolean palindromo = ejercicio2.esPalindormo(texto1);
       System.out.println(palindromo);

    }

    private static void runStack() {
        System.out.println("Stack");
        Stack<String> pila = new Stack<>();

        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);
        Deque<String> pilas = new ArrayDeque<>();
        Deque <String> pila3 = new LinkedList<>();
        pilas.push("a");
        pila3.push("A");
        pila.pop();
        pila.pop();

    }

    private static void runQueue() {
        System.out.println("Queue");
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");
        System.out.println("Esta vacio ?" + cola.isEmpty());
        System.out.println("Tamaño: " + cola.size());

        System.out.println(cola.peek());
        System.out.println(cola.size());

        System.out.println(cola.poll());
        System.out.println(cola.size());

        while (!cola.isEmpty()) {
            String cleinte =cola.poll();
            System.out.println("Atendi a:" + cleinte);
            
        }
        //offer -> Agrega al final
        // peek -> Devuelve elprimero sin eliminar
        // poll -> Devuelve el primerp y lo elimina
    }

    private static void runLinkedlist() {
      System.out.println("Lista Enlazada / LinkedList");
      LinkedList<String> nombres = new LinkedList<>();
      System.out.println("Esta vacia? " + nombres.isEmpty());
      System.out.println("Tamaño:  " + nombres.size());

      nombres.add("Juan");
      nombres.add("Pedro");
      nombres.add("Maria");
      nombres.add("Diego");
      System.out.println("Esta vacia? " + nombres.isEmpty());
      System.out.println("Tamaño:  " + nombres.size());
      

    }
    
}
