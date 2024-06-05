package marlonchimarro;

public class whileMarlonM {
    public void whilemarlonm(int numLines, char printChar) {
        // Ask user to input the character to print
        System.out.println("Printing '" + printChar + "' pattern:");

        int i = 1;
        while (i <= numLines) {
            int j = 1;
            while (j <= numLines) {
                if (j == 1 || j == numLines || (i + j == numLines + 1 && i <= numLines / 2 + 1) || (i == j && i <= numLines / 2)) {
                    System.out.print(printChar);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}