package academy.devdojo.maratonajava.javacore.introducao.sobrecarga.domain.aula57;

public class Anime {
    private String nome;
    private String genero;
    private int epsodios;
    private int temporadas;


    public void init(String nome, String genero, int epsodios) {
        this.nome = nome;
        this.genero = genero;
        this.epsodios = epsodios;
    }

    /**
     * Aqui estamos aplicando o conceito de sobrecarga de metodos
     * como podemos perceber este metodo ja existia, no entanto para que não fique modificando quando bem entendemos
     * podemos criar um novo metodo com o mesmo nome, porem com tipos ou quantidades de parametros diferentes
     * Assim o java entende que este é o mesmo metodo, porem modificado e nosso codigo complica correto.
     *
     * @param nome       the String name of the anime
     * @param genero     the String genero of the anime
     * @param epsodios   the int epsodios of the anime
     * @param temporadas the byte temporadas of the anime
     */
    public void init(String nome, String genero, int epsodios, int temporadas) {
        this.init(nome, genero, epsodios);
        this.temporadas = temporadas;
    }

    public void imprimeAnimeInfos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Epsodios: " + this.epsodios);
        System.out.println("Temporadas: " + this.temporadas);
    }

}
