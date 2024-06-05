package marlonchimarro;

public class whileMarlonChimarroMC {
    public void whilemarlonchimarromc(int numLines, char printChar) {

        // Print both patterns side by side on the same line
        System.out.println("Printing Patterns:");
        int i = 1;
        while (i <= numLines) {
            // Print Pattern M
            int j = 1;
            while (j <= numLines) {
                if (j == 1 || j == numLines || (i + j == numLines + 1 && i <= numLines / 2 + 1) || (i == j && i <= numLines / 2)) {
                    System.out.print(printChar + " ");
                } else {
                    System.out.print("  "); // Print spaces for Pattern 2
                }
                j++;
            }

            // Print a separator between the two patterns
            System.out.print(" ");

            // Print Pattern C
            j = 1;
            while (j <= numLines) {
                if (i == 1 || i == numLines || j == 1) {
                    System.out.print(printChar + " ");
                } else {
                    System.out.print("  "); // Print spaces for Pattern 1
                }
                j++;
            }

            System.out.println(); // Move to the next line after each row
            i++;
        }

    }
}