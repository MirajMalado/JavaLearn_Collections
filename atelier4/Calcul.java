package atelier4;

import java.util.Scanner;

public class Calcul {

    public Calcul()
    {

    }

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int a,b,choix;
        do {

            System.out.println("=====Calculatrice Console=====");
            System.out.println("====1 Somme====");
            System.out.println("====2 Difference====");
            System.out.println("====3 Produit====");
            System.out.println("====4 Quotient====");
            System.out.println("Votre choix : ");
            choix=scan.nextInt();
            if (choix<=0 || choix>5) {
                System.out.println("Votre choix esr invalide. Veillez faire un bon choix.");
            }

        } while (choix<=0 || choix>4);
        
        System.out.println("entre le premier entier:");
        a=scan.nextInt();
        System.out.println("entre le deuxieme entier:");
        b=scan.nextInt();

        switch (choix) {
            case 1:
                somme(a,b);
                break;
            case 2:
                difference(a, b);
                break;
            case 3:
                produit(a, b);
                break;
            case 4: 
                quotient(a, b);
                break;
        
            default:
                break;
        }


    }

    public static void somme(int a,int b)
    {
        int resultat=a+b;
        System.out.println("la somme de "+a+"+"+b+"="+resultat);
    }
    public static void difference(int a,int b)
    {
        int resultat=a-b;
        System.out.println("la difference de "+a+" et "+b+" egal "+resultat);
    }
    public static void produit(int a,int b)
    {
        int resultat=a*b;
        System.out.println("le produit de "+a+" et "+b+"e gal "+resultat);
    }
    public static void quotient(int a,int b)
    {
        int resultat=a/b;
        System.out.println("le quotient de "+a+" et "+b+" egal "+resultat);
    }
}
