package marlonchimarro;

public class doWhileMarlonM {
    public void dowhilemarlonm(int numLines, char printChar) {

        System.out.println("Printing '" + printChar + "' pattern:");
        int i = 1;
        do {
            int j = 1;
            do {
                if (j == 1 || j == numLines || (i + j == numLines + 1 && i <= numLines / 2 + 1) || (i == j && i <= numLines / 2)) {
                    System.out.print(printChar);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j <= numLines);
            System.out.println();
            i++;
        } while (i <= numLines);

    }
}
