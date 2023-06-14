package in.ineuron.question;

public class Question2 {
	static void prevSmaller(int[] arr, int n) {
		System.out.print("_, ");
		for (int i = 1; i < n; i++) {
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					System.out.print(arr[j] + ", ");
					break;
				}
			}
			if (j == -1)
				System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,6,2};
		int n = arr.length;
		prevSmaller(arr, n);
	}
}
