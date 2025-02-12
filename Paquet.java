
import java.util.ArrayList;
import java.util.Collections;

public class Paquet {
    private ArrayList<Carte> Jeu;


    public Paquet() {
        ArrayList Jeu = new ArrayList<Carte>();
        this.Jeu = Jeu;
        CreerJeu();
    }


    public ArrayList<Carte> getJeu() {
        return this.Jeu;
    }

    public void setJeu(ArrayList<Carte> Jeu) {
        this.Jeu = Jeu;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Carte carte : Jeu) {
            sb.append(carte).append("\n");
        }
        return sb.toString();
    }



    public void CreerJeu() {
        for (Famille famille : Famille.values()) {
            for (Valeur valeur : Valeur.values()) {
                Jeu.add(new Carte(famille, valeur));
            }
        }
    }

    public void Melanger() {
        Collections.shuffle(this.Jeu);
    }

}
