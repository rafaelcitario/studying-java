package academy.devdojo.maratonajava.javacore.introducao.construtores.domain.aula58;

public class Anime {
    private String nome;
    private String genero;
    private int epsodios;
    private int temporadas;

    public Anime(String nome, String genero, int epsodios, int temporadas) {
        this.nome = nome;
        this.genero = genero;
        this.epsodios = epsodios;
        this.temporadas = temporadas;

    }

    /**
     * Aplicando conceito de sobrecarga no construtor da classe.
     * Desta forma não é necessario inicializar os atributos da classe na criacão do objeto.
     * No entanto se passado um parametro é necessario passar todos.
     */
    public Anime() {

    }

    public void imprimeAnimeInfos() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Epsodios: " + this.epsodios);
        System.out.println("Temporadas: " + this.temporadas);
    }

}
