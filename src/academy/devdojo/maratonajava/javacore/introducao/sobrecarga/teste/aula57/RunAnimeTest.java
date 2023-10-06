package academy.devdojo.maratonajava.javacore.introducao.sobrecarga.teste.aula57;

import academy.devdojo.maratonajava.javacore.introducao.sobrecarga.domain.aula57.Anime;

public class RunAnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Noragami", "Ação", 24, 0);
        anime.imprimeAnimeInfos();
    }
}
