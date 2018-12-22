
public class NumberSolitaireCodility {

	public static void main(String[] args) {

		int A[] = new int[6];
		A[0] = 1;
		A[1] = -2;
		A[2] = 0;
		A[3] = 9;
		A[4] = -1;
		A[5] = -2;

		NumberSolitaireCodility num = new NumberSolitaireCodility();
		num.solution(A);

	}

	public int solution(int[] A) {

		int[] biggestDistanceOfPebble = new int[A.length];
		biggestDistanceOfPebble[0] = A[0];

		for (int i = 1; i < A.length; i++) {

			int max = Integer.MIN_VALUE;

			for (int die = 1; die <= 6; die++) {

				if (i - die >= 0) {

					max = Math.max(biggestDistanceOfPebble[i - die] + A[i], max);
				}
			}

			biggestDistanceOfPebble[i] = max;
		}
		return biggestDistanceOfPebble[A.length - 1];

	}

}
