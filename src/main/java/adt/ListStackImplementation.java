package adt;

import list.LinkedList;

import java.util.Optional;

public class ListStackImplementation<T> implements Stack<T> {

    private LinkedList<T> linkedList;

    public ListStackImplementation() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void push(T item) {
        linkedList.insertLast(item);
    }

    @Override
    public Optional<T> pop() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            return linkedList.deleteLast();
        }
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void displayStack() {
        if (linkedList.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            linkedList.displayList();
        }
    }
}
