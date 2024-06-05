package marlonchimarro;

public class forMarlonM {
    public void formarlonm(int numLines, char printChar) {

        // Loop to print the pattern
        System.out.println("Printing '" + printChar + "' pattern:");
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= numLines; j++) {
                if (j == 1 || j == numLines || (i + j == numLines + 1 && i <= numLines / 2 + 1) || (i == j && i <= numLines / 2)) {
                    System.out.print(printChar);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}