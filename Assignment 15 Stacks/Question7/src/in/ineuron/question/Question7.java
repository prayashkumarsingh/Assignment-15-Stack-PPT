package in.ineuron.question;

import java.util.*;

public class Question7 {
	public void push(int x) {
		if (stack.isEmpty())
			stack.push(new int[] { x, x });
		else
			stack.push(new int[] { x, Math.min(x, stack.peek()[1]) });
	}

	public void pop() {
		stack.pop();
	}

	public int top() {
		return stack.peek()[0];
	}

	public int getMin() {
		return stack.peek()[1];
	}

	private Stack<int[]> stack = new Stack<>();
}
