package Cliente;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		
		 // Instanciando dois objetos da Classe Cliente
        Cliente cliente1 = new Cliente("João da Silva", "Rua A, 123", "(11) 1234-5678", "joao.silva@email.com", 35);
        Cliente cliente2 = new Cliente("Maria Oliveira", "Avenida B, 456", "(11) 2345-6789", "maria.oliveira@email.com", 25);
        
        // Exibindo os dados dos objetos Cliente utilizando o método visualizar()
        cliente1.visualizar();
        System.out.println();
        cliente2.visualizar();
		
		
		
	}
	
}
