package academy.devdojo.maratonajava.arrays.aula32;

public class Arrays01 {
    public static void main(String[] args) {
        String[] names = {"Rafael", "Leigislane", "Gatinhas"};

        int[] ages = new int[3];
        ages[0] = 15;
        ages[1] = 20;
        ages[2] = 50;


        for (String name : names) {
            System.out.println("Nome: " + name);
        }
    }
}
