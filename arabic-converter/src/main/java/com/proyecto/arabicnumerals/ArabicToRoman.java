package com.proyecto.arabicnumerals;

// Esta clase sirve para convertir números arábigos a números romanos.

public class ArabicToRoman {

    // Se relacionan símbolos romanos en orden, del más grande al más pequeño.

    private String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    // Estos son los valores equivalentes en números arábigos
    private int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    // Este método toma un número, y si todavía puede seguir restando, le pone el
    // símbolo y va restando.

    private int toSymbol(int remaining, int value, String symbol, StringBuilder sb) {
        while (remaining >= value) {
            sb.append(symbol); // se agrega el símbolo romano al resultado
            remaining -= value;
        }
        return remaining;
    }

    // Este es el método principal que convierte de arábigo a romano
    public String toRoman(int arabic) {
        StringBuilder sb = new StringBuilder();
        int remaining = arabic;
        for (int i = 0; i < SYMBOLS.length; i++) {
            remaining = toSymbol(remaining, VALUES[i], SYMBOLS[i], sb);
        }
        return sb.toString();
    }

    // Método main para pruebas
    public static void main(String[] args) {
        ArabicToRoman converter = new ArabicToRoman();

        int[] testNumbers = { 1, 4, 9, 15, 40, 58, 1999, 2023, 3999 };

        for (int num : testNumbers) {
            String roman = converter.toRoman(num);
            System.out.println(num + " => " + roman);
        }
    }
}
