package metier;

public class Produit {
    private Long id;
    private  String nom;
    private  String marque;
    private double prix;
    private int quantite;

    public Produit(Long id, String nom,String marque, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.marque=marque;
        this.prix = prix;
        this.quantite = quantite;

    }


    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }


    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }

}
