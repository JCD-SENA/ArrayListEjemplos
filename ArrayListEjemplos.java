package juan.arraylistejemplos;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Ejercicio 1

Un programa que añada cualquier valor que el usuario ingresó hasta que el usuario escriba :x y luego pone el texto con el numero de linea
*/

public class ArrayListEjemplos {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lineas = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String texto = "";
        do {
            texto = input.readLine();
            if (!texto.equals(":x"))
                lineas.add(texto);
        } while (!texto.equals(":x"));
        for (int i=0; i < lineas.size(); i++) {
            System.out.println(i+": "+lineas.get(i));
        }
    }
}
