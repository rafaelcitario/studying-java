package academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.domain.aula63;

import java.text.NumberFormat;
import java.util.Locale;

public class Livro {

    private String nome;
    private int[] paginas;
    private double preco;

    /*Bloco de inicializacao estatico é chamado assim que a classe é alocada em memoria.
    * assim que a JVM recebe a thread de criacao da classe, antes mesmo da classe ser executada
    * o bloco de inicializacao estatico é chamado.*/
    static {
        System.out.println("Conheça nossos livros:  ");
    }
    public Livro(String nome, int numPaginas, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.paginas = new int[numPaginas];

        for (int i = 0; i < this.paginas.length; i++) {
            this.paginas[i] = i + 1;
        }
    }

    public void livroInfo(){
        String preco = NumberFormat.getCurrencyInstance(new Locale("pt-BR", "BR" )).format(this.preco);
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de páginas: " + this.paginas.length);
        System.out.println("preco: " + preco);
        System.out.println();
    }
}
