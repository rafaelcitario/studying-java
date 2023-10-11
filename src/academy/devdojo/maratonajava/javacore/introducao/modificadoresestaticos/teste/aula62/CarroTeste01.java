package academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.teste.aula62;

import academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.domain.aula62.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca Bala", 280);
        Carro lamborgine = new Carro("Lamborgini", 275);
        Carro dodge = new Carro("Dodge Charger", 290);

        Carro.setVelocidadeLimite(150);
        double velocidadeLimite = Carro.getVelocidadeLimite();
        System.out.println("Classe Carro criada...\n" +
                "Atributos criados e alocados na memoria\n" +
                "Metodos e Atributos estaticos criados e alocados em memoria\n" +
                "Não encontrado blocos de inicializacao.... procurando por construtores\n" +

                "Imprimindo velocidade limite, um atributo statico chamado por um metodo get statico\n" +
                "velocidade limite: " + velocidadeLimite + "\n" +
                "Imprimindo metodo imprime...\n");

        fusca.imprime();
        lamborgine.imprime();
        dodge.imprime();


    }
}
