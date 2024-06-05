package marlonchimarro;

public class forChimarroC {
    public void forchimarroc(int tamano) {
        for (int i = 1; i <= tamano; i++) {
            for (int j = 1; j <= tamano; j++) {
                if ((i == j || i + j == tamano + 1)) {
                    if (i%2==0) {
                        System.out.print(" "+ '0' +" ");
                    } else {
                        System.out.print(" " + '1' + " ");
                    } 
                } else {
                    System.out.print("   ");
                }
                
                System.out.println();
            }
            System.out.println(" ");   
        }
        System.out.println(); 
    }
}


