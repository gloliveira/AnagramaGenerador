

import org.example.AnagramaGenerador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

public class AnagramaGeneradorTest {

    @Test
    public void testGerarAnagramas() {
        // Teste com um grupo de letras
        List<String> anagramasABC = AnagramaGenerador.gerarAnagramas("abc");
        assertEquals(6, anagramasABC.size());
        assertTrue(anagramasABC.contains("abc"));
        assertTrue(anagramasABC.contains("acb"));
        assertTrue(anagramasABC.contains("bac"));
        assertTrue(anagramasABC.contains("bca"));
        assertTrue(anagramasABC.contains("cab"));
        assertTrue(anagramasABC.contains("cba"));

        // Teste com uma única letra
        List<String> anagramasA = AnagramaGenerador.gerarAnagramas("a");
        assertEquals(1, anagramasA.size());
        assertTrue(anagramasA.contains("a"));

        // Teste com entrada vazia
        List<String> anagramasVazio = AnagramaGenerador.gerarAnagramas("");
        assertEquals(0, anagramasVazio.size());

        // Teste com letras distintas
        List<String> anagramasABCD = AnagramaGenerador.gerarAnagramas("abcd");
        assertEquals(24, anagramasABCD.size());
        assertTrue(anagramasABCD.contains("abcd"));
        assertTrue(anagramasABCD.contains("dcba"));
    }

    @Test
    public void testEntradaNula() {
        // Teste com entrada nula
        List<String> anagramasNulo = AnagramaGenerador.gerarAnagramas(null);
        assertEquals(0, anagramasNulo.size());
    }
}

