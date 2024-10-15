package ejercicio051;

public class Ejercicio1 {
    public static void main(String[] args){
        int[][] numMatrix = new int[3][6];

        numMatrix[0][0] = 0;
        numMatrix[0][1]= 30;
        numMatrix[0][2] = 2;
        numMatrix[0][5] = 5;

        numMatrix[1][0] = 75;
        numMatrix[1][4] = 0;

        numMatrix[2][2] = -2;
        numMatrix[2][3] = 9;
        numMatrix[2][5] = 11;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(numMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
