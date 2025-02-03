public class QueueDemo{
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();

        q.enqueue(10);
        q.enqueue(20);

        System.out.println("Queue Front: " + q.peek());
        System.out.println("Queue Rear: " + q.peekRear());
        System.out.print("Queue is: ");
        q.displayQueue();

        q.dequeue();
        q.dequeue();
        System.out.print("Queue is: ");
        q.displayQueue();

        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Queue Front: " + q.peek());
        System.out.println("Queue Rear: " + q.peekRear());
        System.out.print("Queue is: ");
        q.displayQueue();

        q.dequeue();

        System.out.println("Queue Front: " + q.peek());
        System.out.println("Queue Rear: " + q.peekRear());
        System.out.print("Queue is: ");
        q.displayQueue();

    }
}