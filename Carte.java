enum Famille {
    TREFLE, CARREAU, COEUR, PIQUE
}

enum Valeur {
    AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI
}

public class Carte {
    private Famille famille;
    private Valeur valeur;

    // Constructeur
    public Carte(Famille famille, Valeur valeur) {
        this.famille = famille;
        this.valeur = valeur;
    }

    // Getters
    public Famille getFamille() {
        return famille;
    }

    public Valeur getValeur() {
        return valeur;
    }

    // Setters
    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    public void setValeur(Valeur valeur) {
        this.valeur = valeur;
    }

    // Affichage formaté
    @Override
    public String toString() {
        return valeur + " de " + famille;
    }
}
