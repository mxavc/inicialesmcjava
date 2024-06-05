package marlonchimarro;

public class doWhileMarlonChimarroMC {
    public void dowhilemarlonchimarromc(int numLines, char printChar) {

        // Print both patterns side by side on the same line
        System.out.println("Printing Patterns:");
        int i = 1;
        do {
            // Print Pattern 1
            int j = 1;
            do {
                if (j == 1 || j == numLines || (i + j == numLines + 1 && i <= numLines / 2 + 1) || (i == j && i <= numLines / 2)) {
                    System.out.print(printChar + " ");
                } else {
                    System.out.print("  "); // Print spaces for Pattern 2
                }
                j++;
            } while (j <= numLines);

            // Print a separator between the two patterns
            System.out.print("  ");

            // Print Pattern 1
            j = 1;
            do {
                if (i == 1 || i == numLines || j == 1) {
                    System.out.print(printChar + " ");
                } else {
                    System.out.print("  "); // Print spaces for Pattern 1
                }
                j++;
            } while (j <= numLines);

            System.out.println(); // Move to the next line after each row
            i++;
        } while (i <= numLines);

    }
}