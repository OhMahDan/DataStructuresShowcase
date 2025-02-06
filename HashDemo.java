import java.util.HashSet;
public class HashDemo {
	public static void main(String[] args){
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);

		System.out.println("HashSet size: " + hs.size());
		System.out.println("HashSet: " + hs);
	}

}
