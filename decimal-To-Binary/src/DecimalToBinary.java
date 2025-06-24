public class DecimalToBinary {

    public String toBinary(int decimal) {
        StringBuilder result = new StringBuilder();

        do {
            result.append(decimal % 2);
            decimal >>= 1;
        } while (decimal > 0);

        return result.reverse().toString();
    }

    // 👉 Método main agregado para ejecutar la clase directamente
    public static void main(String[] args) {
        DecimalToBinary converter = new DecimalToBinary();
        int number = 10;  // Puedes cambiar el número aquí
        System.out.println("Binario de " + number + " es: " + converter.toBinary(number));
    }
}
