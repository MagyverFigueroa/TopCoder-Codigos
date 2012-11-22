import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class schoolBags {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("src/practice/pruebas.in"));
		String m1 = in.nextLine();
		String peso[] = m1.split(" ");
		String m = in.nextLine();
		String sentimiento[] = m.split(" ");
		int numerosPesos[] = new int[sentimiento.length];
		int max = 0;
		int n = sentimiento.length;
		for (int mask = 0; mask < Math.pow(2, n); mask++) {
			int sumasentimiento = 0, sumapeso = 0;
			int temp[] = new int[n];
			for (int i = 0; i < n; i++) {
				int v = 0;
				if ((mask & (1 << i)) != 0) {
					sumasentimiento += Integer.parseInt(sentimiento[i]);
					sumapeso += Integer.parseInt(peso[i]);
					v = Integer.parseInt(sentimiento[i]);
				}
				temp[i] = v;
			}
			if (sumapeso <= 100) {
				if (sumasentimiento > max)
					numerosPesos = temp.clone();
				max = Math.max(max, sumasentimiento);
			}
		}

		System.out.println(max);
		print(numerosPesos);
		in.close();

	}

	private static void print(Object... rs) {
		System.err.println(Arrays.deepToString(rs));
	}

}
