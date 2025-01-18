package LearnJavaFiles;

public class jan10n25 {
    public static void main(String[] args) {
        char[][] telephone = {{'1', '2', '3'},
                              {'3', '4', '5'},
                              {'6', '7', '8'},
                              {'*', '0', '#'}};

        for (char[] row : telephone) {
            for(char number: row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}