public class DoubleNode<T> {
	public T data;
	public DoubleNode<T> prev, next;

	DoubleNode(T value){
		this.data = value;
		prev = next = null;
	}
}
