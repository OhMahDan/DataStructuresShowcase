// Actual class for the linked list
// TODO: Comments
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

    // Remove first value and return it.
    public T removeHead(){
        if(head == null){
            return null;
        }
        T data = head.data;
        head = head.next;
        return data;
    }
    
    // Search for value and return true or false if found.
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
        if(pos <= 0){
            throw new IllegalArgumentException("Position must be greater than 0");
        }
        if(head == null || pos == 1){
            insertAtHead(value);
            return;
        }
        Node<T> newNode = new Node<>(value);
        Node<T> current = head;
        for(int i = 1; i < pos - 1; i++){
            if(current.next == null){
                current.next = newNode;
                return;
            }
            else{
                current = current.next;
            }   
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void removeValue(T value){
        Node<T> current = head;
        Node<T> nextNode = current.next;
        while(nextNode != null){
            if(nextNode.data == value){
                current.next = nextNode.next;
                return;
            }
            current = current.next;
            nextNode = current.next;
        }
        if(current.data == value){
            removeTail();
        }
    }

    public T removeTail(){
        // If list is empty.
        if(head == null){
            return null;
        }
        
        // If only one node.
        if(head.next == null){
            T temp = head.data;
            head = null;
            return temp;
        }

        // Otherwise, search for tail.
        Node<T> current = head;
        while(current.next.next != null){
            current = current.next;
        }

        // current.next is the tail. Remove it.
        T temp = current.next.data;
        current.next = null;
        return temp;
    }

    public int length(){
        Node<T> current = head;
        int count = 0;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public void reverse(){
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}

