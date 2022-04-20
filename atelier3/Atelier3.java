package atelier3;

import java.util.Scanner;

public class Atelier3 {


    int nbre;
    Scanner scan=new Scanner(System.in);

    public void boucleFor()
    {
        for (int i = 1; i <=5; i++) {
            System.out.println(i);
        }
    }
    public void boucleWile()
    {
        int i=1;
        while (i<=5) {
            System.out.println(i);
            i++;
        }
    }
    public void boucleDoWile()
    {
        int i=1;
        do {
            System.out.println(i);
            i++;
        } while (i<=5);
    }

    public void ControleBoucleDoWile()
    {
        do {
            System.out.println("entre un entier positif: ");
            nbre=scan.nextInt();
        } while (nbre<=0);
    }
    
}
