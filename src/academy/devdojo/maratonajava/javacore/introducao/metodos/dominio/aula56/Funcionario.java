package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula56;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {
    private String nome;
    private int idade;
    private String profissao;
    private double[] salarios;
    private double media;

    private String mediaFormatada() {
        for (double salario : this.salarios) {
            this.media += salario;
        }
        this.media /= this.salarios.length;
        return NumberFormat.getCurrencyInstance(new Locale("pt-BR", "BR")).format(this.media);
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double salario1, double salario2, double salario3) {
        this.salarios = new double[]{salario1, salario2, salario3};
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }


    public void imprimeInformacoes() {
        System.out.println("-----");
        System.out.println("Nome: \t\t\t\t\t" + this.nome);
        System.out.println("Idade: \t\t\t\t\t" + this.idade);
        System.out.println("Profissão: \t\t\t\t" + this.profissao);
        for (double salario : this.salarios) {

            System.out.println("Três últimos salários: \t" + NumberFormat
                    .getCurrencyInstance(new Locale("pt-BR", "BR"))
                    .format(salario));
        }
        System.out.println("Média Salarial: \t\t" + this.mediaFormatada());
        System.out.println("-----");
    }


}
