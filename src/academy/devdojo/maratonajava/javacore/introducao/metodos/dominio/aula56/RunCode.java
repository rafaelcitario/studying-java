package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula56;

public class RunCode {
    public static void main(String[] args) {
        Funcionario devJunior = new Funcionario();
        Funcionario devPleno = new Funcionario();

        devJunior.setNome("Rafael");
        devJunior.setIdade(28);
        devJunior.setProfissao("Dev Júnior");
        devJunior.setSalarios(2000, 3000, 7000);
        devJunior.imprimeInformacoes();

        devPleno.setNome("Rafael Gomes");
        devPleno.setIdade(29);
        devPleno.setProfissao("Dev Pleno");
        devPleno.setSalarios(7000, 9200, 10000);
        devPleno.imprimeInformacoes();


    }
}
