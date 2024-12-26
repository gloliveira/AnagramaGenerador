package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por gerar anagramas de um grupo de letras distintas.
 */
public class AnagramaGenerador {

    /**
     * Método principal que solicita a entrada do usuário e exibe os anagramas gerados.
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um grupo de letras distintas:");
        String Entrada = scanner.nextLine();

        List<String> anagrams = gerarAnagramas(Entrada);

        System.out.println("Anagramas de " + Entrada + ": " + anagrams);
    }

    /**
     * Gera todos os anagramas possíveis de uma string de letras distintas.
     *
     * @param Entrada A string de entrada contendo letras distintas.
     * @return Uma lista de anagramas gerados.
     */
    public static List<String> gerarAnagramas(String Entrada) {
        List<String> resultado = new ArrayList<>();
        if (Entrada == null || Entrada.isEmpty()) {
            return resultado;
        }
        generateAnagramsHelper("", Entrada, resultado);
        return resultado;
    }

    /**
     * Função auxiliar recursiva para gerar anagramas.
     *
     * @param prefixo O prefixo atual na construção do anagrama.
     * @param Entrada    A string restante de letras para combinar.
     * @param resultado A lista de anagramas gerados.
     */
    private static void generateAnagramsHelper(String prefixo, String Entrada, List<String> resultado) {
        int n = Entrada.length();
        if (n == 0) {
            resultado.add(prefixo);
        } else {
            for (int i = 0; i < n; i++) {
                generateAnagramsHelper(prefixo + Entrada.charAt(i), Entrada.substring(0, i) + Entrada.substring(i + 1, n), resultado);
            }
        }
    }
}
