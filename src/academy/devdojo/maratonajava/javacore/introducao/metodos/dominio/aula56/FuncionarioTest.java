package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula56;

public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Salarios salarios = new Salarios();

        funcionario.setNome("Rafael");
        funcionario.setIdade(-1);
        salarios.setSalarios(2000, 3200, 5320);


        funcionario.imprime();
        salarios.imprimeMediaFormatada();
    }

}
