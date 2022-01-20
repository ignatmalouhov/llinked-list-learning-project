package adt;

import java.util.Optional;

public interface Queue<T> {

    void insert(T item);
    Optional<T> remove();
    boolean isEmpty();
    void displayQueue();

}
