package APP;

import metier.NonexistentException;
import metier.StorageGenerique;

public class App {
    public static void main(String[] args) {
        StorageGenerique<String> liste = new StorageGenerique<>();
        liste.addElement(12, "oil");
        liste.addElement(44, "vetement");

        System.out.println("Le nombre des éléments dans la liste : " + liste.getSize());

        try {
            System.out.println("Element avec ID 12 : " + liste.getElement(12));
            System.out.println("Element avec ID 13 : " + liste.getElement(13));
        } catch (NonexistentException e) {
            System.out.println(e.getMessage());
        }
    }
}
