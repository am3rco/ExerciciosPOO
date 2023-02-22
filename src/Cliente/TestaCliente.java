package Cliente;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		// Instanciando um objeto da Classe Cliente
		Cliente cliente = new Cliente("Julio Da Gaita", "julinho@juju.com", "Homem", "(11)-999999999", 18);
		
		Scanner leia = new Scanner(System.in);
		
		// Declara as Variaveis
		String n, g, e, t;
		int i;
		
		System.out.println("\nInsira o seu nome: ");
		n = leia.nextLine();
		cliente.setNome(n);
		
		System.out.println("\nInsira o seu email: ");
		e = leia.nextLine();
		cliente.setEmail(e);
		
		System.out.println("\nInsira o seu genero: ");
		g = leia.nextLine();
		cliente.setGenero(g);
		
		System.out.println("\nInsira o seu telefone: ");
		t = leia.nextLine();
		cliente.setTelefone(t);
		
		System.out.println("\nInsira a sua idade: ");
		i = leia.nextInt();
		cliente.setIdade(i);
		
		// Imprime a visualização do Cliente
		cliente.visualizar();
		
		
	}
	
}
