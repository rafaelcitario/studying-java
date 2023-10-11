package academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.teste.aula63;

import academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.domain.aula63.Livro;

public class LivroTeste {
    public static void main(String[] args) {
        Livro cleanCode = new Livro("Clean Code", 10, 120);
        Livro dataStructAndAlgorithmJS = new Livro("Estrutura de dados e algoritimos em JavaScript", 25, 80);

        cleanCode.livroInfo();
        dataStructAndAlgorithmJS.livroInfo();

    }
}
