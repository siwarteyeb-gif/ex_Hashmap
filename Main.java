package ex2_Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Annuaire a = new Annuaire();
        Scanner s = new Scanner(System.in);
        String cmd;

        do {
            System.out.print("Commande: ");
            cmd = s.nextLine();

            if (cmd.startsWith("+")) {
                String nom = cmd.substring(1);
                System.out.print("Numero: ");
                String numero = s.nextLine();
                System.out.print("Adresse: ");
                String adrs = s.nextLine();

                Fiche f = new Fiche(nom, numero, adrs);
                a.ajouter(f);
            }

            else if (cmd.startsWith("?")) {
                String nom = cmd.substring(1);
                Fiche f = a.chercher(nom);

                if (f != null)
                    System.out.println(f);
                else
                    System.out.println("nom introuvable");
            }

            else if (cmd.equals("!")) {
                System.out.println("Fiches triées par nom:");
                a.trier();
            }

        } while (!cmd.equals("."));

        s.close();
        System.out.println("programme terminé.");
    }
}
