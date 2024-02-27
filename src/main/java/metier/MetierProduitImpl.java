package metier;

import java.util.ArrayList;
import java.util.List;


public class MetierProduitImpl implements IMetier<Produit, Long> {

    List<Produit> list=new ArrayList();



    @Override
    public void addProduit(Produit p) {
         list.add(p);
    }

    @Override
    public List<Produit> getAll() {

        for (Produit Produit:list) {
            return list;
            
        }
        return list;
    }




    @Override
     public Produit FindById(Long id)throws NonexistentException  {
        for (Produit p:list){
           // ==true
            if(!(list.contains(p.getId())))throw new NonexistentException("id n'existe pas !! ");
                return p;

        }
        return null;
        }

    @Override
    public void deleteById(Long id) throws NonexistentException {
        Produit produit= this.FindById(id);
        if (produit!=null){
            list.remove(produit);
        }


    }

}
