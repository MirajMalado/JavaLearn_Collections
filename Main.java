import java.util.Scanner;

import atelier4.Personne;


public class Main {

    public static void main(String[] args) {
        
        Personne pers=new Personne();
        Personne[] persaisie= pers.saisiePersonneV2();
        for (int i = 0; i < persaisie.length; i++) {
            System.out.println(persaisie[i].toString());
        }
      
    }
    
}
