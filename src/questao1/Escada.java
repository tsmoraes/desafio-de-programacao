/**
 * 
 */
package questao1;

/**
 * @author Thiago da Silva Moraes
 *
 *         Escreva um algoritmo que mostre na tela uma escada de tamanho n
 *         utilizando o caractere * e espa�os. A base e altura da escada devem
 *         ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum
 *         espa�o.
 * 
 */
public class Escada {

	public static void main(String[] args) {
		criaEscada(0);
	}

	public static int degraus = 0;

	/**
	 * Imprime uma escada feita de *.
	 * 
	 * @param Quantidade de degraus.
	 */
	public static void criaEscada(int n) {
		degraus = n;

		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) // imprime os espa�os
				System.out.print(" ");
			for (int j = 1; j <= i; j++) // imprime os *
				System.out.print("*");
			System.out.print("\n");

		}

		System.out.print(degraus);
	}
}
