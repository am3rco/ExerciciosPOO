package Funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int idade;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, int idade, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
        this.departamento = departamento;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Idade: " + idade);
        System.out.println("Departamento: " + departamento);
    }
}