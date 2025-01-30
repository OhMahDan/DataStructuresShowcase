public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        list.printList();

        boolean found20 = list.search(20);
        System.out.println("Found 20? " + found20);
        
        int removed = list.removeHead();
        System.out.println("Removed: " + removed);
        list.printList();
    }
    
}
