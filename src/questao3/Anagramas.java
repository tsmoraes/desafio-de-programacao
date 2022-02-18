/**
 * 
 */
package questao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Thiago da Silva Moraes
 * 
 *         Duas palavras podem ser consideradas anagramas de si mesmas se as
 *         letras de uma palavra podem ser realocadas para formar a outra
 *         palavra. Dada uma string qualquer, desenvolva um algoritmo que
 *         encontre o número de pares de substrings que são anagramas.
 *
 */
public class Anagramas {

	public static void main(String[] args) {
		try (Scanner ent = new Scanner(System.in)) {
			String s;
			System.out.println("Digite a palavra/frase:");
			s = ent.nextLine();

			System.out.println(getQuantidadeDeAnagramas(s));
		} catch (Exception e) {
			System.out.print("Error: " + e);
		}
	}

	/**
	 * Retorna o número de anagramas contido na palavra.
	 * 
	 * @param palavra.
	 * @return número de anagramas.
	 */
	public static int getQuantidadeDeAnagramas(String palavra) {
		int anagrams = 0;

		ArrayList<String> subStrings = new ArrayList<String>();

		for (int i = 1; i <= palavra.length(); i++) {
			for (int j = 0; j <= palavra.length() - i; j++) {
				subStrings.add(palavra.substring(j, j + i));
			}
		}

		for (int i = 0; i < subStrings.size(); i++) {
			for (int j = i + 1; j < subStrings.size(); j++) {
				if (comparaAnagramas(subStrings.get(i), subStrings.get(j)))
					anagrams++;
			}
		}

		return anagrams;
	}

	/**
	 * Compara duas palavras para verificar se são anagramas entre si.
	 * 
	 * @param a @{@link String} primeira palavra.
	 * @param b @{@link String} segunda palavra.
	 * @return verdadeiro se as palavras são anagramas, caso contrário, retorna
	 *         falso.
	 */
	public static boolean comparaAnagramas(String a, String b) {
		char aChars[] = a.toCharArray();
		char bChars[] = b.toCharArray();

		Arrays.sort(aChars);
		Arrays.sort(bChars);

		String aStringSroted = new String(aChars);
		String bStringSroted = new String(bChars);

		return aStringSroted.equals(bStringSroted);
	}
}