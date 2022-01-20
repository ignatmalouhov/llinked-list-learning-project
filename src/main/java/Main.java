import adt.ListQueueImplementation;
import adt.ListStackImplementation;
import adt.Queue;
import adt.Stack;
import list.LinkedList;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        System.out.println(linkedList1.isEmpty());
        linkedList1.displayList();

        linkedList1.insertLast(1);
        System.out.println(linkedList1.isEmpty());
        linkedList1.displayList();
        System.out.println();

        linkedList1.insertLast(2);
        linkedList1.insertLast(3);
        linkedList1.displayList();
        System.out.println();

        linkedList1.insertFirst(0);
        linkedList1.displayList();
        System.out.println();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.insertLast(5);
        linkedList2.displayList();
        System.out.println();

        linkedList2.insertFirst(4);
        linkedList2.insertFirst(3);
        linkedList2.displayList();
        System.out.println();

        linkedList2.deleteFirst();
        linkedList2.deleteFirst();
        linkedList2.deleteFirst();
        linkedList2.displayList();
        System.out.println();

        linkedList2.insertFirst(1);
        linkedList2.deleteFirst();
        linkedList2.displayList();
        System.out.println();

        linkedList2.insertFirst(1);
        linkedList2.deleteLast();
        linkedList2.displayList();
        System.out.println();

        linkedList2.insertFirst(1);
        Optional<Integer> optional1 = linkedList2.find(1);
        Integer integer1 = optional1.get();
        System.out.println(integer1);

        Optional<Integer> optional2 = linkedList2.find(2);
        System.out.println(optional2.isPresent());

        System.out.println(linkedList2.deleteByKey(2));
        linkedList2.displayList();
        System.out.println();

        System.out.println(linkedList2.deleteByKey(1));
        linkedList2.displayList();
        System.out.println();

        Queue<Integer> queue = new ListQueueImplementation();

        System.out.println(queue.isEmpty());
        queue.displayQueue();
        System.out.println();

        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        queue.displayQueue();
        System.out.println();

        System.out.println(queue.remove());
        queue.remove();
        queue.displayQueue();
        System.out.println();

        Stack<Integer> stack = new ListStackImplementation<>();

        System.out.println(stack.isEmpty());

        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.displayStack();
        System.out.println();

        System.out.println(stack.pop());
        stack.pop();

        stack.displayStack();
        System.out.println();

        stack.pop();
        stack.displayStack();
        System.out.println();

    }
}
