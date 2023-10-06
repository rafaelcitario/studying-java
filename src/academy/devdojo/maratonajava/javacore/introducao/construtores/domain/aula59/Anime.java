package academy.devdojo.maratonajava.javacore.introducao.construtores.domain.aula59;

public class Anime {
    private String nome;
    private String genero;
    private int epsodios;
    private int temporadas;
    private String capa;

    public Anime(String nome, String genero, int epsodios, int temporadas) {
        this.nome = nome;
        this.genero = genero;
        this.epsodios = epsodios;
        this.temporadas = temporadas;
    }

    public Anime(String nome, String genero, int epsodios, int temporadas, String capa){
        this(nome, genero, epsodios, temporadas);
        this.capa = capa;
    }

    public void imprimeinfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Número de epsódios: " + this.epsodios);
        System.out.println("Número de temporadas: " + this.temporadas);
        System.out.println("capa: " + this.capa);
        System.out.println("");
    }


}
