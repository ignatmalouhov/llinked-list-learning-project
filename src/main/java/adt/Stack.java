package adt;

import java.util.Optional;

public interface Stack<T> {

    void push(T item);
    Optional<T> pop();
    boolean isEmpty();
    void displayStack();

}
