package Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "Programador", 5000.00, 25, "TI");
        Funcionario f2 = new Funcionario("Maria", "Gerente", 8000.00, 35, "Administração");

        f1.visualizar();
        System.out.println();
        f2.visualizar();
    }
}
