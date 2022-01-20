package list;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

public class LinkedList<T> implements Iterable<T> {

    private Link<T> first;

    public LinkedList() {
        first = null;
    }

    private class LinkedListIterator implements Iterator<T> {

        private Link<T> current;

        public LinkedListIterator() {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return (current.next != null);
        }

        @Override
        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            T value = current.getValue();
            current = current.next;
            return value;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(T value) {
        if (value != null) {
            Link<T> newLink = new Link<>(value);
            newLink.next = first;
            first = newLink;
        }
    }

    public void insertLast(T value) {
        if (value != null) {
            if (isEmpty()) {
                first = new Link<>(value);
            } else {
                Link<T> newLink = new Link<>(value);
                Link<T> current = first;

                while (current.next != null) {
                    current = current.next;
                }
                current.next = newLink;
            }
        }
    }

    public Optional<T> deleteFirst() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            Link<T> tempLink = first;
            first = first.next;
            return Optional.of(tempLink.getValue());
        }
    }

    public Optional<T> deleteLast() {

        if (isEmpty()) {
            return Optional.empty();
        } else {
            Link<T> current = first;
            if (first.next == null) {
                first = null;
            } else {
                Link<T> beforeCurrent = null;

                while (current.next != null) {
                    beforeCurrent = current;
                    current = current.next;
                }
                beforeCurrent.next = null;
            }
            return Optional.of(current.getValue());
        }
    }

    public Optional<T> find(T value) {
        if (value != null && !isEmpty()) {
            Link<T> current = first;
            while (current != null) {
                if (current.getValue().equals(value)) {
                    return Optional.of(current.getValue());
                }
                current = current.next;
            }
        }
        return Optional.empty();
    }

    public boolean deleteByKey(T value) {
        if (value == null || isEmpty()) {
            return false;
        } else {
            Link<T> current = first;
            Link<T> beforeCurrent = first;

            while (current != null) {
                if (current.getValue().equals(value)) {
                    if (current == beforeCurrent) {
                        first = first.next;
                    } else {
                        beforeCurrent.next = current.next;
                    }
                    return true;
                }
                beforeCurrent = current;
                current = current.next;
            }
        }
        return false;
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.print("List is empty");
        } else {
            Link<T> current = first;
            while (current != null) {
                current.displayLink();
                current = current.next;
            }
        }
    }
}
