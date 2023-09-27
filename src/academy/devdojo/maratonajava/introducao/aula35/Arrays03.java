package academy.devdojo.maratonajava.introducao.aula35;

public class Arrays03 {
    public static void main(String[] args) {
        // how to declare arrays
        int[] numeros1 = new int[3];
        int[] numeros2 = {1, 2, 6, 4, 2, 3, 10};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};


        for (int numero : numeros3) {
            System.out.println(numero);
        }
        System.out.println("Comprimento do array: " + numeros3.length);
    }
}
