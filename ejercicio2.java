package juan.arraylistejemplos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
Ejercicio 3

Un programa que cree una lista unidimencional que el usuario pueda expandir o reducir su tamaño
*/

public class ejercicio2 {
    public static void main(String[] args) {
        int opcion = 0, n = 0;
        ArrayList<Character> lista = new ArrayList<Character>();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Opciones\n1. Expandir\n2. Reducir\n3. Mostrar\n4. Salir"));
            switch (opcion) {
                case 1:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el incremento de tamaño"));
                    if (n > 0)
                        for (int i = 0; i < n; i++)
                            lista.add('#');
                    else
                        JOptionPane.showMessageDialog(null, "El valor debe ser positivo");
                    break;
                case 2:
                    n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el incremento de tamaño"));
                    if (n > 0)
                        for (int i = 0; i < n; i++)
                            lista.remove(i);
                    else
                        JOptionPane.showMessageDialog(null, "El valor debe ser positivo");
                    break;
                case 3:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.print(lista.get(i));
                    }
                    System.out.println("\nTamaño de la lista: "+lista.size());
                    break;
                default:
                    System.out.println();
            }
        } while (opcion != 4);
    }
}