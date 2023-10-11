package academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.domain.aula61;

public class Carro {
    public static double velocidadeLimite = 250;
    private String marca;
    private double velocidadeMaxima;

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("-----------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade Maxíma: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }
}
