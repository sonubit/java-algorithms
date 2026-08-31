package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue: " + queue);

        System.out.println("Head: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue: " + queue);
    }
}
