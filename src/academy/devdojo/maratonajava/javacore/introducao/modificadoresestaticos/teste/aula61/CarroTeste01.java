package academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.teste.aula61;

import academy.devdojo.maratonajava.javacore.introducao.modificadoresestaticos.domain.aula61.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca Bala", 280);
        Carro lamborgine = new Carro("Lamborgini", 275);
        Carro dodge = new Carro("Dodge Charger", 290);

        /*Modificadores estaticos fazem referencia direta a classe.
         * mesmo que eu modifique o atributo velocidadeMaxima acessando atravez da instancia fusca
         * este atributo sera modificado para todas as instancias, pois estou modificando diretamente na classe
         * não apenas uma instancia.
         * */
        Carro.velocidadeLimite = 100;

        fusca.imprime();
        lamborgine.imprime();
        dodge.imprime();


    }
}
