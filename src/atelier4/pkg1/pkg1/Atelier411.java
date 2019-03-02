/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelier4.pkg1.pkg1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ASUS
 */
public class Atelier411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList pays = new ArrayList();
        pays.add("Tunisie");
        pays.add("France");
        pays.add("Allemagne");
        pays.add("Turquie");

        System.out.println("La collection créee contient: " + pays.size() + " pays!");

        //affiche(pays);
        //pays.clear();
        //System.out.println("La collection créee contient: " + pays.size() + " pays!");
        pays.add("Russie");
        pays.remove("France");
        //affiche(pays);
        Collections.sort(pays);
        affiche(pays);
    }

    public static void affiche(ArrayList pays) {
        if (!pays.isEmpty()) {
            for (int i = 0; i < pays.size(); i++) {
                System.out.println(pays.get(i));
            }
        } else {
            System.out.println("Liste vide!");
        }
    }

}
