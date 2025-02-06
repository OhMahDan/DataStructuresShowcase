//TODO: Finish delete at position method.
public class DoublyLinkedList<T> {
	private DoubleNode<T> head, tail;

	DoublyLinkedList(){
		this.head = this.tail = null;
	}

	public int length(){
		DoubleNode<T> temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void insertAtHead(T value){
		DoubleNode<T> newNode = new DoubleNode<>(value);
		if(head == null){
			head = tail =  newNode;
			return;
		}
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}

	public void insertAtTail(T value){
		DoubleNode<T> newNode = new DoubleNode<>(value);
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	public void insertAtPosition(T value, int position){
		DoubleNode<T> newNode = new DoubleNode<>(value);
		DoubleNode<T> temp = head;
		for(int i = 0; i < position; i++){
			temp = temp.next;

		}
		DoubleNode<T> afterTemp = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
		newNode.next = afterTemp;
		afterTemp.prev = newNode;
	}

	public void delHead(){
		if(head == null){
			return;
		}
		head = head.next;
		head.prev = null;
	}

	public void delTail(){
		if(tail == null){
			return;
		}
		tail = tail.prev;
		tail.next = null;
	}

	public void delPosition(int position){
		DoubleNode<T> temp = head;
		for(int i = 0; i < position - 1; i++){
			temp = temp.next;
		}
		temp.next = temp.next.next;
		temp = temp.next;
		temp.prev = temp.prev.prev;
	}

	public void fowardTraverse(){
		DoubleNode<T> temp = head;
		while(temp != null){
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public void backwardTraverse(){
		DoubleNode<T> temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		while(temp != null){
			System.out.print(temp.data + " -> ");
			temp = temp.prev;
		}
		System.out.println("null");
	}

}
