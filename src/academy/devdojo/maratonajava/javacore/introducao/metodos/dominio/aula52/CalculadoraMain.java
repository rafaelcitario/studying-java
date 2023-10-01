package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula52;

public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculator.somaArray(numeros);
        calculator.somaVarArgs(5, 4, 3, 2, 1);

    }
}
