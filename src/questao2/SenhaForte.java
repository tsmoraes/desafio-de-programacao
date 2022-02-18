/**
 * 
 */
package questao2;

import java.util.Scanner;

/**
 * @author Thiago da Silva Moraes
 * 
 *         D�bora se inscreveu em uma rede social para se manter em contato com
 *         seus amigos. A p�gina de cadastro exigia o preenchimento dos campos
 *         de nome e senha, por�m a senha precisa ser forte.
 *
 */
public class SenhaForte {

	public static void main(String[] args) {
		System.out.println("Por favor, entre com a senha:");
		
		try (Scanner scanner = new Scanner(System.in)) {
			boolean teste = Senha.validaSenha(scanner.nextLine());

			System.out.print(teste);

		} catch (Exception e) {
			System.out.print("Error: " + e);
		}
	}

}

class Senha {

	/**
	 * Verifica se a senha tem no m�nimo 6 d�gitos, um n�mero, uma letra min�scula, uma letra mai�scula 
	 * e pelo menos um destes caracteres especiais: !@#$%^&*()-+
	 * 
	 * @param Senha.
	 * @return Retorna verdadeiro se a senha atender a todos os requisitos para ser segura.
	 */
	public static boolean validaSenha(String senha) {
		if (senha.length() < 6) {
			System.out.println("Precisa ter no m�nimo 6 d�gitos.");
			System.out.println(senha.length());
			return false;
		} else
			System.out.println(senha.length());

		boolean achouDigito = false;
		boolean achouMaiuscula = false;
		boolean achouMinuscula = false;
		boolean achouCaractere = false;
		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				achouDigito = true;
			} else if (c >= 'A' && c <= 'Z') {
				achouMaiuscula = true;
			} else if (c >= 'a' && c <= 'z') {
				achouMinuscula = true;
			} else if (senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$")
					|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")
					|| senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				achouCaractere = true;
			}
		}

		if (!achouDigito) {
			System.out.println("Precisa ter um n�mero.");
			return achouDigito && achouMaiuscula && achouMinuscula && achouCaractere;

		} else if (!achouMaiuscula) {
			System.out.println("Precisa ter uma letra mai�sculo.");
			return achouDigito && achouMaiuscula && achouMinuscula && achouCaractere;

		} else if (!achouMinuscula) {
			System.out.println("Precisa ter uma letra min�sculo.");
			return achouDigito && achouMaiuscula && achouMinuscula && achouCaractere;

		} else if (!achouCaractere) {
			System.out.println("Precisa ter um destes caracteres especiais: !@#$%^&*()-+");
			return achouDigito && achouMaiuscula && achouMinuscula && achouCaractere;

		} else {
			return achouDigito && achouMaiuscula && achouMinuscula && achouCaractere;
		}
	}
}
