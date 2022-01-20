package adt;

import list.LinkedList;

import java.util.Optional;

public class ListQueueImplementation<T> implements Queue<T> {

    private LinkedList<T> linkedList;

    public ListQueueImplementation() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void insert(T item) {
        linkedList.insertLast(item);
    }

    @Override
    public Optional<T> remove() {
        if (linkedList.isEmpty()) {
            return Optional.empty();
        } else {
            return linkedList.deleteFirst();
        }
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void displayQueue() {
        if (linkedList.isEmpty()) {
            System.out.print("Queue is empty");
        } else {
            linkedList.displayList();
        }
    }
}
