package marlonchimarro;

public class doWhileChimarroC {
    public void dowhilechimarroc(int numLines, char printChar) {


        // Loop to print the pattern using do-while loops
        int i = 1;
        do {
            int j = 1;
            do {
                // Print the character if it's the first or last row, or the first column
                if (i == 1 || i == numLines || j == 1) {
                    System.out.print(printChar);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j <= numLines);
            System.out.println(); // Move to the next line after each row
            i++;
        } while (i <= numLines);

    }
}