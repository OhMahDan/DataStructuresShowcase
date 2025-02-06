public class Deque<T> {
	private Node<T> head;

	public Deque(){
		this.head = null;
	}

	public boolean isEmpty(){
		return head == null;
	}

	public int size(){
		int count = 0;
		Node<T> temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void push_front(T value){
		Node<T> temp = new Node<>(value);
		if(isEmpty()){
			head = temp;
			return;
		}
		temp.next = head;
		head = temp;
	}

	public void push_back(T value){
		Node<T> temp = new Node<>(value);
		if(isEmpty()){
			head = temp;
			return;
		}
		Node<T> traverseNode = head;
		while(traverseNode.next != null){
			traverseNode = traverseNode.next;
		}
		traverseNode.next = temp;
	}

	public void pop_front(){
		if(isEmpty()){
			return;
		}
		head = head.next;
	}

	public void pop_back(){
		if(isEmpty()){
			return;
		}
		Node<T> temp = head;
		while(temp.next.next != null){
			temp = temp.next;
		}
		temp.next = null;
	}

	public T front(){
		return head.data;
	}

	public T back(){
		if(isEmpty()){
			System.out.println("Deque Underflow");
			return null;
		}
		Node<T> temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		return temp.data;
	}

	public void displayDeque(){
		if(isEmpty()){
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
