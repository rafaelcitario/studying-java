package academy.devdojo.maratonajava.introducao.aula34;

public class Arrays02 {

    /**
     * void types return
     * byte, short, int, long, float and double return 0
     * char return '\u0000'
     * boolean return false
     * String return null
     */


    public static void main(String[] args) {
        String[] animals = new String[3];
        animals[0] = "Dogs";
        animals[1] = "Cats";
        animals[2] = "Monkeys";

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
