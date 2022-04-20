package atelier3;

import java.util.Scanner;
public class TestValeur {

    int nbre1,nbre2,resultat;
    public void testValeur()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre le premier nombre: ");
        nbre1=scan.nextInt();
        System.out.println("Entre le deuxieme nombre: ");
        nbre2=scan.nextInt();
        resultat=nbre1+nbre2;
        System.out.println("La somme de "+nbre1+" + " +nbre2+" = "+resultat);
        if (nbre1>nbre2) {
            System.out.println(nbre1+" est superieur a "+nbre2);
        }if (nbre1<nbre2) {
            System.out.println(nbre1+" est inferieur a "+nbre2);
        } else {
            System.out.println(nbre1+" est egal a "+nbre2);
        }
    }
    
}
