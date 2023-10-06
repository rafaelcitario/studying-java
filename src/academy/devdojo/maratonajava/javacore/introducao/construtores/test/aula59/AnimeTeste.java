package academy.devdojo.maratonajava.javacore.introducao.construtores.test.aula59;

import academy.devdojo.maratonajava.javacore.introducao.construtores.domain.aula59.Anime;

public class AnimeTeste {
    public static void main(String[] args) {

        Anime naruto = new Anime("Naruto", "Shounen", 220, 5);
        Anime narutoShippuden = new Anime("Naruto Shippuden", "Shounen", 500, 10, "capa da temporada");
        naruto.imprimeinfos();
        narutoShippuden.imprimeinfos();


    }
}
