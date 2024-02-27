package metier;

import java.util.List;

public interface IMetier <T , U> {

    void addProduit(T o);
    List<T> getAll();
    T FindById(U id) throws NonexistentException;




    void deleteById(U id) throws NonexistentException;


}
