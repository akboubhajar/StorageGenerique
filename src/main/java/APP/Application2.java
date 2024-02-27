package APP;

import metier.MetierProduitImpl;
import metier.NonexistentException;
import metier.Produit;

import java.util.ArrayList;
import java.util.List;

public class Application2 {
    public static void main(String[] args) throws NonexistentException {

         MetierProduitImpl listProduits=new MetierProduitImpl();


    listProduits.addProduit(new Produit(12L,"oil","maroc",300,2));
    listProduits.addProduit(new Produit(44L,"vetement","maroc",600,1));




        System.out.println(listProduits.getAll()) ;
        System.out.println(listProduits.FindById(12L));
        listProduits.deleteById(44L);

        System.out.println(listProduits.getAll()) ;
        try {
            System.out.println(listProduits.FindById(12L));
        }catch (NonexistentException e){
            System.out.println(e.getMessage());
        }


    }
}
