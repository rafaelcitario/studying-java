package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula53;

import java.sql.Array;
import java.text.NumberFormat;
import java.util.Locale;


public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    private String getMediaSalario() {


        double media = 0;
        for (double i : salario) media += i;
        media /= salario.length;


        if (salario.length == 0) {
            media = 0;
        }

        return NumberFormat.getCurrencyInstance(new Locale("pt-BR", "BR")).format(media);

    }

    public void imprime() {
        System.out.println("Nome: \t" + nome);
        System.out.println("Idade: \t" + idade);
        System.out.println("Média salárial: \t" + getMediaSalario());
    }
}
