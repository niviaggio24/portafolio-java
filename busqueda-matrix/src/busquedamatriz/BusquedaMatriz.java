/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedamatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author FREYN
 */
public class BusquedaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        // cargar matriz
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz[" + i + "][" + j + "]"));
                System.out.print("\t" + matriz[i][j]);
            }
        }

        // insertar número a buscar
        int numeroBusqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número a buscar"));
        boolean encontrado = false;

        // buscar número en matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == numeroBusqueda) {
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Número encontrado en posición [" + i + "][" + j + "]");
                }
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Número no encontrado");
        }
    }

}
