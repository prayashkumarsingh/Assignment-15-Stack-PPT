package in.ineuron.question;
import java.util.*;

public class Question4 {
	static Stack<Character> st = new Stack<>();
	static void insertBottom(char x) {

		if (st.isEmpty())
			st.push(x);

		else {
			char a = st.peek();
			st.pop();
			insertBottom(x);
			st.push(a);
		}
	}
	static void reverse() {
		if (st.size() > 0) {
			char x = st.peek();
			st.pop();
			reverse();
			insertBottom(x);
		}
	}
	public static void main(String[] args) {
		st.push('3');
		st.push('2');
		st.push('1');
		st.push('7');
		st.push('6');

		System.out.println("Original Stack");

		System.out.println(st);
		reverse();

		System.out.println("Reversed Stack");

		System.out.println(st);
	}
}
