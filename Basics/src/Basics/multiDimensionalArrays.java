package Basics;

public class multiDimensionalArrays {
    public static void main(String[] args) {
        int[][] cube = {{1,2,3},{4,5,6}}; // Has 2 indexes, one for the array and one for the element in that array.

        System.out.println(cube[1][2]+"\n"); // Selects the index assigned to 1, then the element assigned to 2 in that index.

        for(int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.println(cube[i][j]);
            }
        }
    }
}
