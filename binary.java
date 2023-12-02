public class binary {
    public static void main(String[] args) {
        int[][][] array = new int[3][9][27];

        // Initialize the array with values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 27; k++) {
                    array[i][j][k] = i + j + k;
                }
            }
        }

        // Print the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 27; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
