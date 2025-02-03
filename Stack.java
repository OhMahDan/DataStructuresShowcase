public class Stack<T> {
    private Node<T> top;
    
    public Stack(){
        this.top = null;
    }

    boolean isEmpty() {
        return top == null;
    }

    public void push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode; 
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("\nStack Underflow");
            return;
        }
        top = top.next;
    }

    public T peek(){
        if(top == null){
            System.out.println("Stack is empty.");
            return null;
        }
        return top.data;
    }

    public void displayStack(){
        Node<T> tempNode = top;
        while(tempNode != null){
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }
}
