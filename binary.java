package practice;

import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while (in.hasNext()) {
			int n = in.nextInt();
			int priceBook2[] = new int[n];
			for (int i = 0; i < n; i++) {
				priceBook2[i] = in.nextInt();
			}
			Arrays.sort(priceBook2);
			int total = in.nextInt();
			int min1 = 10005;
			int min[] = new int[2];
			for (int i = 0; i < priceBook2.length; i++) {
				int a = priceBook2[i];
				int b = total - a;
				int ans = Arrays.binarySearch(priceBook2, b);
				if (ans >= 0) {
					if (ans != i)
						if ((a - b) < min1) {
							min1 = Math.abs(a - b);
							min[0] = a;
							min[1] = b;
						}
				}
			}
			out.println("Peter should buy books whose prices are "+min[0]+" and "+min[1]+".\n");
//			System.out.println("Peter should buy books whose prices are "+min[0]+" and "+min[1]+".\n");
		
		}
		in.close();
		out.close();
	}

	private static void print(Object... rs) {
		System.err.println(Arrays.deepToString(rs));
	}
}
