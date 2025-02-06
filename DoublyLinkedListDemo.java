public class DoublyLinkedListDemo {
	public static void main(String[] args) {
		DoublyLinkedList<Integer> lst = new DoublyLinkedList<>();
		lst.insertAtHead(1);
		lst.insertAtHead(2);
		lst.insertAtHead(3);
		lst.insertAtTail(0);
		lst.insertAtPosition(2, 1);

		System.out.println("List length: " + lst.length());

		lst.fowardTraverse();
		lst.backwardTraverse();

		lst.delHead();
		lst.delPosition(1);
		lst.delTail();
		lst.fowardTraverse();
	}

}
