import java.util.Scanner;

import marlonchimarro.forChimarroC;
//import marlonchimarro.doWhileChimarroC;
//import marlonchimarro.doWhileMarlonM;
//import marlonchimarro.whileChimarroC;
//import marlonchimarro.whileMarlonM;
//import marlonchimarro.whileMarlonChimarroMC;
//import marlonchimarro.doWhileMarlonChimarroMC;
//import marlonchimarro.forMarlonM;
//import marlonchimarro.forMarlonChimarroMC;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        /*
        whileMarlonM wm = new whileMarlonM();
        whileChimarroC wc = new whileChimarroC();
        whileMarlonChimarroMC wmc = new whileMarlonChimarroMC();
        doWhileChimarroC dwc = new doWhileChimarroC();
        doWhileMarlonChimarroMC dwmc = new doWhileMarlonChimarroMC();
        forMarlonM fm = new forMarlonM();
        forChimarroC fc = new forChimarroC();
        forMarlonChimarroMC fmc = new forMarlonChimarroMC();
         */
        
        //doWhileMarlonM dwm = new doWhileMarlonM();
        forChimarroC fc = new forChimarroC();

        char symb;
        String auxString;
        int size = 0;
        boolean isCorrect = false;

        System.out.println("\n--> Taller 1 <--\n");

        while (true) {
            System.out.print("-> Ingrese un tamaño definido mayor a 4: ");
            auxString = keyboard.nextLine();

            for (int i = 0; i < auxString.length(); i++) {
                if (!Character.isDigit(auxString.charAt(i))) {
                    isCorrect = false;
                } else {
                    isCorrect = true;
                }
            }

            if (isCorrect) {
                size = Integer.valueOf(auxString);
                if (size <= 4) {
                    System.out.println("\nHa ingresado un bajo del limite, ingrese nuevamente...\n");
                } else {
                    break;
                }
            } else {
                System.out.println("\nHa ingresado un valor no numérico, ingrese nuevamente...\n");
                size = -1;
            }
        }

        isCorrect = false;

        do {
            System.out.print("\n-> Ingrese un caracter: ");
            auxString = keyboard.nextLine();
            if (!auxString.isEmpty()) {
                symb = auxString.charAt(0);
                isCorrect = true;
            } else {
                System.out.println("\nHa ingresado un valor vacío, ingrese nuevamente...\n");
                symb = ' ';
                isCorrect = false;
            }
        } while (!isCorrect);
        /*
        System.out.println("While - MarlonM");
        wm.whilemarlonm(size, symb);
        System.out.println("While - ChimarroC");
        wc.whilechimarroc(size, symb);
        System.out.println("While - MarlonChimarroMC");
        wmc.whilemarlonchimarromc(size, symb);  
        System.out.println("Do While - ChimarroC");
        dwc.dowhilechimarroc(size, symb);       
        System.out.println("Do While - MarlonChimarroMC");
        dwmc.dowhilemarlonchimarromc(size, symb); 
        System.out.println("For - MarlonM");
        fm.formarlonm(size, symb);  
          
        System.out.println("For - MarlonChimarroMC");
        fmc.formarlonchimarromc(size, symb);
         */
          
        //System.out.println("Do While - MarlonM");
        //dwm.dowhilemarlonm(size, symb);         
        System.out.println("For - ChimarroC");
        fc.forchimarroc(size);
        
        
        keyboard.close();
    }
}
