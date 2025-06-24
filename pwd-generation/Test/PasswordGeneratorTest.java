import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class PasswordGeneratorTest {

    @Test
    void testGeneratePassword_LowercaseAndNumbers() {
        List<String> args = Arrays.asList("-L", "-N");
        String password = PasswordGenerator.generate(args);
        assertEquals(16, password.length());
        assertTrue(password.matches("[a-z0-9]+"), "La contraseña debe contener solo minúsculas y números");
    }

    @Test
    void testGeneratePassword_UpperAndLowerAndSymbols() {
        List<String> args = Arrays.asList("-U", "-L", "-S");
        String password = PasswordGenerator.generate(args);
        assertEquals(16, password.length());
        assertTrue(password.matches("[a-zA-Z$#&/()=?|\\[\\]]+"), "Debe incluir mayúsculas, minúsculas y símbolos");
    }

    @Test
    void testGeneratePassword_InvalidCombinationThrows() {
        List<String> args = Arrays.asList("-U", "-S");  // No es una combinación válida según tu mapa
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            PasswordGenerator.generate(args);
        });
        assertTrue(ex.getMessage().contains("Combinación de argumentos no soportada"));
    }
}
