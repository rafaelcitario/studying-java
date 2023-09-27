package academy.devdojo.maratonajava.introducao.aula36;

import java.lang.module.FindException;
import java.lang.reflect.Array;

public class ArraysMult01 {
    public static void main(String[] args) {

        int[][] meses = new int[3][3];

        meses[0][0] = 31;
        meses[0][1] = 28;
        meses[0][2] = 31;

        meses[1][0] = 31;
        meses[1][1] = 28;
        meses[1][2] = 31;

        meses[2][0] = 31;
        meses[2][1] = 28;
        meses[2][2] = 31;


        for (int[] mes : meses) {
            for (int dia : mes) {
                System.out.println(dia);
            }
        }


        /** the code above is a different form about the below code
         * for (int i = 0; i < meses.length; i++) {
         *             for (int j = 0; j < meses[i].length; j++) {
         *                 System.out.println(meses[i][j]);
         *  }
         *}
         */


    }
}
