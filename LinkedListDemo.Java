public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);

        list.printList();

        boolean found20 = list.search(20);
        System.out.println("Found 20? " + found20);
        
        int removed = list.removeHead();
        System.out.println("Removed: " + removed);
        list.printList();

        list.insertAtPosition(2, 25);
        System.out.println("Inserted 25 at pos 2");
        list.printList();

        list.insertAtPosition(1, 35);
        System.out.println("Inserted 35 at pos 1");
        list.printList();

        list.removeValue(15);
        System.out.println("Removed 15.");
        list.printList();

        System.out.println("Size of list: " + list.length());
    }
    
}
