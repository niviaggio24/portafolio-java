package com.proyecto.arabicnumerals;

import java.util.HashMap;
import java.util.Map;

// Esta clase sirve para convertir números romanos a arábigos

public class RomanToArabic {

    // Este mapa guarda el valor de cada letra romana, como 'I' vale 1, 'V' vale 5, etc.
    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }
    // Este método convierte el número romano a arábigo

    public int toArabic(String roman) {
        int total = 0;
        int prev = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int current = romanMap.getOrDefault(c, 0);
    // Si el valor actual es menor al anterior, hay que restarlo (como IV = 5 - 1)
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current;
        }

        return total;  // devuelvo el número en arábigo
    }

    // Método main para pruebas rápidas
    public static void main(String[] args) {
        RomanToArabic converter = new RomanToArabic();

        String[] testRomans = {"I", "IV", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M", "MCMXCIX", "MMMCMXCIX"};

        for (String roman : testRomans) {
            int arabic = converter.toArabic(roman);
            System.out.println(roman + " => " + arabic);
        }
    }
}
