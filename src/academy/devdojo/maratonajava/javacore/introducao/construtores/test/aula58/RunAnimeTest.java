package academy.devdojo.maratonajava.javacore.introducao.construtores.test.aula58;

import academy.devdojo.maratonajava.javacore.introducao.construtores.domain.aula58.Anime;

public class RunAnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Kiss to sis", "Eichii", 12, 1);
        Anime onePiece = new Anime("One piece", "Acão", 1075, 11);
        anime.imprimeAnimeInfos();
        onePiece.imprimeAnimeInfos();
    }
}
