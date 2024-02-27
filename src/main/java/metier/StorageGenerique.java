package metier;

import java.util.HashMap;
import java.util.Map;

public class StorageGenerique<T> {
    private Map<Integer, T> elements;

    public StorageGenerique() {
        this.elements = new HashMap<>();
    }

    public void addElement(Integer id, T element) {
        elements.put(id, element);
    }

    public T getElement(Integer id) throws NonexistentException {
        if (!elements.containsKey(id)) {
            throw new NonexistentException("ID n'existe pas !!");
        }
        return elements.get(id);
    }

    public int getSize() {
        return elements.size();
    }

    public void removeElement(Integer id) {
        elements.remove(id);
    }
}
