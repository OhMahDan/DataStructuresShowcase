public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);

        System.out.println("\nTop element is " + st.peek());
        System.out.print("\nStack is: ");
        st.displayStack();

        System.out.println("\nRemoving two elements...");
        st.pop();
        st.pop();

        System.out.print("\nStack is: ");
        st.displayStack();
    }
}
