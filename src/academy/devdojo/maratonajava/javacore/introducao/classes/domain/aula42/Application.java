package academy.devdojo.maratonajava.javacore.introducao.classes.domain.aula42;

public class Application {
    public static void main(String[] args) {
        Carro honda = new Carro();
        Carro mazda = new Carro();
        Carro ferrari = new Carro();


        honda.nome = "Honda";
        honda.modelo = "2021";
        honda.ano = 2021;

        mazda.nome = "Mazda";
        mazda.modelo = "2014";
        mazda.ano = 2014;

        ferrari.nome = "Ferrari";
        ferrari.modelo = "2024 3000";
        ferrari.ano = 2024;

        String message = "Nome: %s\nModelo: %s\nAno: %s";

        Carro[] list = {honda, mazda, ferrari};


        int t = 0;
        for (Carro a : list) {
            t++;
            if (t > 1) {
                System.out.println("\n");
            }
            System.out.printf(message, a.getNome(), a.getModelo(), a.getAno());
        }
    }
}
