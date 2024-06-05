package marlonchimarro;

public class whileChimarroC {
    public void whilechimarroc(int numLines, char printChar) {

        int i = 1;
        while (i <= numLines) {
            int j = 1;
            while (j <= numLines) {
                // Print the character if it's the first or last row, or the first column
                if (i == 1 || i == numLines || j == 1) {
                    System.out.print(printChar);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }

    }
}