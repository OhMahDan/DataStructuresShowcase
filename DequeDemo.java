public class DequeDemo {

	public static void main(String[] args){
		Deque<Integer> dq = new Deque<>();

		dq.push_front(1);
		dq.push_back(0);
		dq.push_front(2);
		dq.push_back(3);

		System.out.println("Deque size: " + dq.size());
		dq.displayDeque();

		System.out.println("Deleting " + dq.front());
		dq.pop_front();
		System.out.println("Deleting " + dq.back());
		dq.pop_back();
		
		dq.displayDeque();
	}
	
}
