
import java.util.ArrayList;

public class Joueur {
    private String nom;
    private ArrayList<Carte> main;
    

    public Joueur(String nom, ArrayList<Carte> main) {
        this.nom = nom;
        this.main = main;
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Carte> getMain() {
        return this.main;
    }

    public void setMain(ArrayList<Carte> main) {
        this.main = main;
    }

    public ArrayList<Carte> Piocher(ArrayList<Carte> paquet){
        main.add(paquet.get(0));
        paquet.remove(0);

        return paquet;
    }


    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            ", main='" + getMain() + "'" +
            "}";
    }

    
}
