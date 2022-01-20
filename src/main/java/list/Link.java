package list;

import lombok.Getter;

public class Link<T> {

    @Getter
    private T value;
    protected Link<T> next;

    public Link(T value) {
        next = null;
        this.value = value;
    }

    public void displayLink() {
        System.out.print(getValue() + "; ");
    }
}
