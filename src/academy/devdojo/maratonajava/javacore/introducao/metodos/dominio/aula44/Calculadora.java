package academy.devdojo.maratonajava.javacore.introducao.metodos.dominio.aula44;

public class Calculadora {
    public void sum(int... number) {
        int total = 0;
        for (int i : number) {
            total += i;
        }
        System.out.println(total);
    }

    public void sub(int... number) {
        int total = 0;
        for (int i : number) {
            total -= i;
        }
        System.out.println(total);
    }

    public void multiplication(int... number) {
        int total = 1;
        for (int i : number) {
            total *= i;
        }
        System.out.println(total);
    }


}
