
import java.util.ArrayList;
import java.util.Scanner;

public class Table {
    private ArrayList<Joueur> Joueurs;
    private Paquet jeu;
    private int nbJoueurs;
    private int tour;


    public Table() {
        DebutPartie();
        this.nbJoueurs = Joueurs.size();
        this.tour = 0;
    }

    public void DebutPartie(){
        Scanner console = new Scanner(System.in);
        System.out.print("Entrez le nombre de joueur: ");
        int nb = console.nextInt();
        while(nb < 2){
            System.out.print("Entrez un nombre de joueur superieur à 2: ");
            nb = console.nextInt();
        }

        this.Joueurs = new ArrayList<Joueur>();
        for (int i = 0; i < nb; i++) {
            String variableName = "J" + i;
            Joueur J = new Joueur(variableName, null);
            Joueurs.add(J);
        }

        this.jeu = new Paquet();

        for (Joueur joueur : Joueurs) {
            joueur.Piocher(jeu);
            joueur.Piocher(jeu);
        }

        System.out.println(Joueurs);


    }
}
