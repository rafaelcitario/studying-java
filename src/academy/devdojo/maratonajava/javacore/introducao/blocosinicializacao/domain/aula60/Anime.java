package academy.devdojo.maratonajava.javacore.introducao.blocosinicializacao.domain.aula60;

public class Anime {
    private String nome;
    private int[] epsodios;

    // Blocos de inicialização:
    // 1- É alocado espaço em memoria
    // 2- É definido parametros da classe com valores null/0 ou o valor que for passado.
    // 3- Os blocos de inicialização são executados.
    // 4- É executado os construtores.

    /** por que utilizar blocos de inicialização?
     * Os blocos de inicialização são utilizados para que não seja preciso ficar copiando codigo
     * sempre que criamos uma sobrecarga de construtores, podemos utilizar os blocos de inicialização
     * assim todos os construtores recebem tudo o que for passado dentro dos blocos.**/
    {
        epsodios = new int[10];
        for (int i = 0; i < this.epsodios.length; i++) {
            this.epsodios[i] = i + 1;
        }
    }

    public Anime() {
        for (int epsodio : this.epsodios) {
            System.out.print("Epsódio: " + epsodio);
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
        for (int epsodio : this.epsodios) {
            System.out.print("Epsódio: " + epsodio);
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }

}
