package in.ineuron.question;

public class Question1 {
	static void nxtGrtrElemnt(int arr[], int n) {
		int next, i, j;
		for (i = 0; i < n; i++) {
			next = -1;
			for (j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i] + " -- " + next);
		}
	}

	public static void main(String args[]) {
		int arr[] = {1,3,2,4};
		int n = arr.length;
		nxtGrtrElemnt(arr, n);
	}
}