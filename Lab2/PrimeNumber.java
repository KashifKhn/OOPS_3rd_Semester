public class PrimeNumber {

	public static void main(String[] args) {
		int limCount = 0;
		int upperLimit = 100;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			int div = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					div = div + 1;
				}
				// System.out.println("hh");
			}
			// System.out.println(div);
			if (div == 0) {
				System.out.println(limCount + " >>   " + i + " ");
				limCount++;
			}
			if(limCount == upperLimit)
				break;
		}

	}

}
