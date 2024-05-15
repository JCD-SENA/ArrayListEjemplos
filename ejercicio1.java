package juan.arraylistejemplos;

import java.util.ArrayList;

/*
Ejercicio 2

Un programa que tome una lista arreglo que escale de 1 a 9 y le añada el inverso al final
*/

public class ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> escala = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++)
            escala.add(i);
        for (int i = 9; i > 0; i--)
            escala.add(i);
        for (int i = 0; i < escala.size(); i++) {
            System.out.println(escala.get(i));
        }
    }
}
