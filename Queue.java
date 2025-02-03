public class Queue<T> {
    private Node<T> head, rear;

    public Queue(){
        this.head = this.rear = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        Node<T> tempNode = head;
        int count = 0;
        while(tempNode != null){
            count++;
        }
        return count;
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            head = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return;
        }
        head = head.next;
        if(head == null){
            rear = null;
        }
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return null;
        }
        return head.data;
    }

    public T peekRear(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return null;
        }
        return rear.data;
    }

    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
