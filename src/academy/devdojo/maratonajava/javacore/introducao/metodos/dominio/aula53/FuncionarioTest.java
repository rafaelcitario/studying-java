package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula53;

public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Rafael";
        funcionario.idade = 28;

        funcionario.salario = new double[3];
        funcionario.salario[0] = 2000;
        funcionario.salario[1] = 3000;
        funcionario.salario[2] = 7000;
        funcionario.imprime();
    }

}
