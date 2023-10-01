package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula52;

public class Calculadora {
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    /**
     * @param numeros  this varArgs looks like a rest and spreed operator at javaScript
     */
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
