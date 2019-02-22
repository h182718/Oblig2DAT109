package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author kjetilhunshammer
 */
public class Terningspill {
    private int id;

    public Terningspill(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Terningspill Spill = new Terningspill(1);
        Spill.spill();
    }

    public Spiller leggTilSpiller(String navn) {
        Spiller spiller = new Spiller(navn);
        return spiller;
    }

    /**
     * Starter spillet
     */
    private void spill() {

        Terningspill spill = new Terningspill(1);

        Kopp kopp = new Kopp(1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange spilere?");
        int spillerCount = Integer.parseInt(scanner.nextLine());
        //Liste med spillere som skal spille
        ArrayList<Spiller> players = new ArrayList<>(spillerCount);
        // Opprett spillere
        for (int i = 0; i < spillerCount; i++) {
            System.out.println("Navn på spiller " + (i + 1) + "?");
            String spillernavn = scanner.nextLine();
            players.add(spill.leggTilSpiller(spillernavn));
        }

        Spiller vinner = players.get(0);
        // Spill for hver spiller
        for (Spiller spiller : players) {
            spiller.spill(kopp);
            //Legge overskrive vinner om spiller har høyere score.
            if (spiller.getVerdi() > vinner.getVerdi()) {
                vinner = spiller;
            }

            System.out.println("Spiller " + spiller.getNavn() + " fikk " + spiller.getVerdi());
        }
        // Skriver ut vinner. Første som får terner den høyeste scoren, blir vinneren.
        System.out.println("Vinner er " + vinner.getNavn());


    }
}
