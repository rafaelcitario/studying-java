package academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.domain.aula62;

public class Carro {

    /*tranformando o atributo velocidade limite statico em privado
     * esta modificacao de acesso é possivel por que um metodo statico é um metoco direto referente a classe
     * sendo assim também é preciso criar um metodos get e set staticos para que a captura deste dado velocidade limite seja possivel.
     *
     * metodos e atributos estaticos não necessitam da criação de um objeto/instancia
     * podendo ser chamado diretamento da classe, exemplo: Carro.getVelocidadeLimite(), Carro.setVelocidadeLimite(valor double)
     *
     * estes metodos get e set são publicos por isso é possivel chamalos
     * logo Carro.velocidadeLimite não é possivel ser chamado, pois é um atributo privado.
     * */


    private static double velocidadeLimite = 250;
    private String marca;
    private double velocidadeMaxima;

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
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
}
