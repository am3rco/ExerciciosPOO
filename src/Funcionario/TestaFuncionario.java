package Funcionario;

import java.util.Scanner;

import Cliente.Cliente;

public class TestaFuncionario {

	public static void main(String[] args) {

		// Instancia um objeto da Classe Funcionario
		Funcionario funcionario = new Funcionario("Julio Da Gaita", "Profissional do Amor", "Homem", 18, "Rua do Ble - Jardim do Bla - São Paulo SP");

		Scanner leia = new Scanner(System.in);

		// Declara as Variaveis
		String n, g, cargo1, endereco1;
		int i;

		System.out.println("\nInsira o seu nome: ");
		n = leia.nextLine();
		funcionario.setNome(n);

		System.out.println("\nInsira o seu cargo: ");
		cargo1 = leia.nextLine();
		funcionario.setCargo(cargo1);

		System.out.println("\nInsira o seu genero: ");
		g = leia.nextLine();
		funcionario.setGenero(g);

		System.out.println("\nInsira a sua idade: ");
		i = leia.nextInt();
		funcionario.setIdade(i);
		
		System.out.println("\nInsira o seu endereço: ");
		endereco1 = leia.nextLine();
		funcionario.setEndereço(endereco1);

		// Imprime a visualização do Cliente
		funcionario.visualizar();

	}

}
