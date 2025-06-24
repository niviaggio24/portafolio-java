/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleReaderPyramid;

//import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author freyn
 */

public class ConsoleReaderPyramid {

    public void square(int max, String symbol) {

        for (int a = 1; a <= max; a++) {
            for (int b = max - 1; b >= 0; b--) {

                System.out.print("  " + symbol);

            }
            System.out.println("");
        }
    }

    public void printTriangle(int max, String symbol) {

        for (int b = 0; b < max; b++) {

            for (int a = 0; a <= b; a++) {

                System.out.print(symbol);

            }

            System.out.println("");

        }

    }

    public void printTriangleDes(int max, String symbol) {

        for (int b = (max - 1); b > -1; b--) {

            for (int a = 0; a <= b; a++) {

                System.out.print(symbol);

            }

            System.out.println("");

        }

    }

    public void printTriangleDesDer(int max, String symbol) {

        int d = max - 1;
        int c = 0;
        for (int b = 0; b < max; b++) {

            for (int a = 0; a <= b; a++) {

                while (c != d) {
                    System.out.print(" ");
                    c++;
                }
                System.out.print(symbol);
            }

            System.out.println("");
            c = 0;
            d--;
        }

    }

    public void printTriangleAscDer(int max, String symbol) {

        int d = 0;
        int c = max;
        int esc = 1;
        for (int b = 0; b < max; b++) {

            for (int a = 0; a <= b; a++) {

                while (c != d) {
                    System.out.print(symbol);
                    c--;
                }
            }

            System.out.println("");

            for (int j = 0; j < esc; j++) {
                System.out.print(" ");
            }
            esc++;
            c = max;
            d++;
        }
    }

    // piramide profe aca es donde se deberia generar la piramide con num impar no
    // se con un if(i%2 !=0)

    public void pyramid(int max, String symbol) {

        for (int i = 0; i <= max; i++) {

            for (int k = max - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(symbol);
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ConsoleReaderPyramid cr = new ConsoleReaderPyramid();
        int maxRows = 0;
        String symbol = "";
        int gen = 0;

        do {

            System.out.println("====MENU DE FIGURAS====");
            System.out.println("");
            System.out.println("1. CUADRADO");
            System.out.println("2. TRIANGULO ASC ALINEADO A LA IZQ");
            System.out.println("3. TRIANGULO DESC ALINEADO A LA IZQ");
            System.out.println("4. TRIANGULO ASC ALINEADO A LA DER");
            System.out.println("5. TRIANGULO DESC ALINEADO A LA DER");
            System.out.println("6. PIRÁMIDE");
            System.out.println("");
            System.out.print("Digite la opción deseada: ");
            int opc = s.nextInt();
            System.out.println("");

            if (opc == 1) {

                System.out.print("Ingrese el numero de filas:");

                // System.out.print("o (-1) para salir.");
                maxRows = s.nextInt();

                s.nextLine();

                System.out.print("Ingrese el simbolo de filas:");

                symbol = s.nextLine();

                cr.square(maxRows, symbol);

            }

            if (opc == 2) {

                System.out.print("Ingrese el numero de filas:");

                // System.out.print("o (-1) para salir.");
                maxRows = s.nextInt();

                s.nextLine();

                System.out.print("Ingrese el simbolo de filas:");

                symbol = s.nextLine();

                cr.printTriangle(maxRows, symbol);

            }

            if (opc == 3) {

                System.out.print("Ingrese el numero de filas:");

                // System.out.print("o (-1) para salir.");
                maxRows = s.nextInt();

                s.nextLine();

                System.out.print("Ingrese el simbolo de filas:");

                symbol = s.nextLine();

                cr.printTriangleDes(maxRows, symbol);

            }

            if (opc == 4) {

                System.out.print("Ingrese el numero de filas:");

                // System.out.print("o (-1) para salir.");
                maxRows = s.nextInt();

                s.nextLine();

                System.out.print("Ingrese el simbolo de filas:");

                symbol = s.nextLine();

                cr.printTriangleDesDer(maxRows, symbol);

            }

            if (opc == 5) {

                System.out.print("Ingrese el numero de filas:");

                // System.out.print("o (-1) para salir.");
                maxRows = s.nextInt();

                s.nextLine();

                System.out.print("Ingrese el simbolo de filas:");

                symbol = s.nextLine();

                cr.printTriangleAscDer(maxRows, symbol);
                System.out.println("");

            }

            if (opc == 6) {

                System.out.print("Ingrese el numero de filas:");

                // System.out.print("o (-1) para salir.");
                maxRows = s.nextInt();

                s.nextLine();

                System.out.print("Ingrese el simbolo de filas:");

                symbol = s.nextLine();

                cr.pyramid(maxRows, symbol);
                System.out.println("");

            }

            System.out.print("Desea generar otra figura (1. - SI 2. - NO): ");
            gen = s.nextInt();
        } while (gen == 1);
        s.close();

    }

}