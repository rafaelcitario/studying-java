package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula56;

public class Funcionario {
    Salarios salarios = new Salarios();
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println("Nome: \t" + this.nome);
        System.out.println("Idade: \t" + this.idade);
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            this.idade = 0;
            return;
        }
        this.idade = idade;
    }
}
