package marlonchimarro;

public class forMarlonChimarroMC {
    public void formarlonchimarromc(int size, char symb) {    

        for (int i = 1; i <= size; i++) {
            // letra M
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || (i + j == size + 1 && i <= size / 2 + 1) || (i == j && i <= size / 2)) {
                    System.out.print(symb + " ");
                } else {
                    System.out.print("  "); 
                }
            }

            System.out.print("  ");

            // Letra C
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1) {
                    System.out.print(symb + " ");
                } else {
                    System.out.print("  "); 
                }
            }

            System.out.println(); 
        }

    }
}