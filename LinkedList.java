// Actual class for the linked list
// TODO: Code insertAtPosition, removeValue, reverse, and length methods
public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void insertAtHead(T value){
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        Node<T> current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtEnd(T value){
        if(head == null){
            insertAtHead(value);
        }
        else{
            Node<T> newNode = new Node<>(value);
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public T removeHead(){
        if(head == null){
            return null;
        }
        T data = head.data;
        head = head.next;
        return data;
    }
    
    public boolean search(T value){
        Node<T> current = head;
        while(current != null){
            if(current.data == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void insertAtPosition(int pos, T value){

    }
}
