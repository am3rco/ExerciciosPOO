package Funcionario;

public class Funcionario {

	// Declarando os Atributos da Classe
	private String nome;
	private String cargo;
	private String genero;
	private int idade;
	private String endereco;
	
	public Funcionario(String nome, String cargo, String genero, int idade, String endereço) {
		this.nome = nome;
		this.cargo = cargo;
		this.genero = genero;
		this.idade = idade;
		this.endereco = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereco;
	}

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
	
	// Método para visualizar os dados do Funcionario
		public void visualizar() {
			System.out.println("\nNome: " + nome);
			System.out.println("\nCargo: " + cargo);
			System.out.println("\nGenero: " + genero);
			System.out.println("\nIdade: " + idade);
			System.out.println("\nEndereço: " + endereco);
		}
	
	
	
	
	
}
