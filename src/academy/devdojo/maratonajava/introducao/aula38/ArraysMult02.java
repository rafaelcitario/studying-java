package academy.devdojo.maratonajava.introducao.aula38;

public class ArraysMult02 {
    public static void main(String[] args) {

        int[][] arrayBase = new int[3][]; // create a multidimensional vector with 3 positions, that positions have no content valor
        // form number one
        arrayBase[0] = new int[2]; // create a vector with 2 positions inside to the vector position 0
        arrayBase[0][1] = 30; // declare the valor by vector position 1 from vector position 0
        System.out.println(arrayBase[0][1]); // 30

        // form number two
        arrayBase[1] = new int[]{1, 2, 3, 4}; // create a vector with 4 positions inside vector from position 1
        System.out.println(arrayBase[1][2]); // 3

        // form number three
        int[] arr = {5, 6, 7, 8}; // create a vector
        arrayBase[2] = arr; // pass the vector arr inside to arrayBase into position 2 [[0][1][2 = [5, 6, 7, 8]]]
        System.out.println(arrayBase[2][2]); // 7


    }
}
