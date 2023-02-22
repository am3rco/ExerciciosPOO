package Cliente;

public class Cliente {

	// Declarando os Atributos da Classe
	private String nome;
	private String email;
	private String genero;
	private String telefone;
	private int idade;
	
	public Cliente(String nome, String email, String genero, String telefone, int idade) {
		this.nome = nome;
		this.email = email;
		this.genero = genero;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Gênero: " + genero);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: "+ idade);
	}
	
}
