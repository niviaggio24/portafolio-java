import java.awt.*;
import java.awt.datatransfer.*;
import java.util.*;
import java.util.List;


public class PasswordGenerator {

    private static Random random = new Random();

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor ingrese al menos dos argumentos.");
            return;
        }

        String pass1 = "";

        // Normalizar argumentos para simplificar comparaciones
        List<String> argList = Arrays.asList(args);
        Collections.sort(argList);

        int length = 16; // longitud fija por defecto

        try {
            if (args.length == 2) {
                pass1 = generatePassword(argList, length);

                // Caso especial: copiar al portapapeles si args es -U y el otro es "Copy"
                if ((argList.contains("-U") && (args[0].equalsIgnoreCase("Copy") || args[1].equalsIgnoreCase("Copy")))) {
                    copyToClipboard(pass1.toUpperCase());
                    System.out.println("Contraseña copiada al portapapeles: " + pass1.toUpperCase());
                } else {
                    System.out.println(pass1);
                }

            } else if (args.length == 3) {
                pass1 = generatePassword(argList, length);
                System.out.println(pass1);
            } else {
                System.out.println("Número de argumentos inválido.");
            }
        } catch (Exception e) {
            System.out.println("Error al generar contraseña: " + e.getMessage());
        }
    }

    private static String generatePassword(List<String> sortedArgs, int length) {
        // Mapear combinaciones de flags a arreglos de caracteres permitidos
        Map<Set<String>, String[]> charSets = new HashMap<>();

        charSets.put(new HashSet<>(Arrays.asList("-L", "-N")),
                new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                    "p", "q", "r", "s", "t", "v", "x", "y", "z",
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
                });

        charSets.put(new HashSet<>(Arrays.asList("-A", "-U")),
                new String[]{
                    "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R",
                    "S", "T", "U", "V", "W", "X", "Z"
                });

        charSets.put(new HashSet<>(Arrays.asList("-L", "-A")),
                new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "p", "q", "r",
                    "s", "t", "v", "w", "x", "y", "z"
                });

        charSets.put(new HashSet<>(Arrays.asList("-U", "-L", "-S")),
                new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                    "p", "q", "r", "s", "t", "v", "w", "x", "y", "z",
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                    "$", "#", "&", "/", "(", ")", "=", "?", "|", "[", "]"
                });

        charSets.put(new HashSet<>(Arrays.asList("-L", "-N", "-S")),
                new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                    "p", "q", "r", "s", "t", "v", "w", "x", "y", "z",
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                    "$", "#", "&", "/", "(", ")", "=", "?", "|", "[", "]"
                });

        charSets.put(new HashSet<>(Arrays.asList("-L", "-U")),
                new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                    "p", "q", "r", "s", "t", "v", "w", "x", "y", "z",
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
                });

        charSets.put(new HashSet<>(Arrays.asList("-L", "-U", "-N")),
                new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                    "p", "q", "r", "s", "t", "v", "w", "x", "y", "z",
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"
                });

        charSets.put(new HashSet<>(Arrays.asList("-L", "-U", "-N", "-S")),
                new String[]{
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                    "p", "q", "r", "s", "t", "v", "w", "x", "y", "z",
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                    "$", "#", "&", "/", "(", ")", "=", "?", "|", "[", "]"
                });

        // Buscar la combinación correcta para los argumentos
        String[] selectedSet = null;
        for (Set<String> key : charSets.keySet()) {
            if (key.equals(new HashSet<>(sortedArgs))) {
                selectedSet = charSets.get(key);
                break;
            }
        }

        if (selectedSet == null) {
            throw new IllegalArgumentException("Combinación de argumentos no soportada: " + sortedArgs);
        }

        StringBuilder passBuilder = new StringBuilder();
        int setLength = selectedSet.length;

        for (int i = 0; i < length; i++) {
            passBuilder.append(selectedSet[random.nextInt(setLength)]);
        }

        return passBuilder.toString();
    }

    private static void copyToClipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
    // Método público auxiliar para pruebas unitarias
public static String generate(List<String> sortedArgs) {
    Collections.sort(sortedArgs);
    return generatePassword(sortedArgs, 16);
}

}
