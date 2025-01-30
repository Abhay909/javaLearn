package LearnJavaFiles.TwoDimensionArrays;

public class numPad {

    public static void main(String[] args) {
        // 2 dimensional arrays
        // Initializing
        char[][] numPad = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        // for every row in the length of numPad, do this.
        for (int r = 0; r < numPad.length; r++) {
            // for every column in the length of rows do this.
            for (int c = 0; c < numPad[r].length; c++) {
                // r = row; c = column
                System.out.print(numPad[r][c] + " ");
            }
            // Add Space to format
            System.out.println();
        }
    }
}
