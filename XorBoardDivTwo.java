import java.util.Arrays;

public class XorBoardDivTwo {
	public int theMax(String[] board) {
		int contar0 = 0, max = 0, contin = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				if (board[i].charAt(j) == '1')
					contin++;
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length(); j++) {
				for (int k = 0; k < board.length; k++) {
					if (board[k].charAt(j) == '0')
						contar0 += 1;
					else
						contar0--;
				}
				for (int k = 0; k < board[0].length(); k++) {
					if (board[i].charAt(k) == '0')
						contar0 += 1;
					else
						contar0--;
				}

				if(board[i].charAt(j)=='1')contar0+=2;
				else contar0-=2;
				max=Math.max(max, (contar0+contin));
				contar0 = 0;
			}

		}

		return max;
	}

	// BEGIN CUT HERE
	public static void main(String[] args) {
		if (args.length == 0) {
			XorBoardDivTwoHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				XorBoardDivTwoHarness.run_test(Integer.valueOf(args[i]));
		}
	}
	// END CUT HERE
}

// BEGIN CUT HERE
class XorBoardDivTwoHarness {
	public static void run_test(int casenum) {
		if (casenum != -1) {
			if (runTestCase(casenum) == -1)
				System.err.println("Illegal input! Test case " + casenum
						+ " does not exist.");
			return;
		}

		int correct = 0, total = 0;
		for (int i = 0;; ++i) {
			int x = runTestCase(i);
			if (x == -1) {
				if (i >= 100)
					break;
				continue;
			}
			correct += x;
			++total;
		}

		if (total == 0) {
			System.err.println("No test cases run.");
		} else if (correct < total) {
			System.err.println("Some cases FAILED (passed " + correct + " of "
					+ total + ").");
		} else {
			System.err.println("All " + total + " tests passed!");
		}
	}

	static boolean compareOutput(int expected, int result) {
		return expected == result;
	}

	static String formatResult(int res) {
		return String.format("%d", res);
	}

	static int verifyCase(int casenum, int expected, int received) {
		System.err.print("Example " + casenum + "... ");
		if (compareOutput(expected, received)) {
			System.err.println("PASSED");
			return 1;
		} else {
			System.err.println("FAILED");
			System.err.println("    Expected: " + formatResult(expected));
			System.err.println("    Received: " + formatResult(received));
			return 0;
		}
	}

	static int runTestCase(int casenum__) {
		switch (casenum__) {
		case 0: {
			String[] board = { "101", "010", "101" };
			int expected__ = 9;

			return verifyCase(casenum__, expected__,
					new XorBoardDivTwo().theMax(board));
		}
		case 1: {
			String[] board = { "111", "111", "111" };
			int expected__ = 5;

			return verifyCase(casenum__, expected__,
					new XorBoardDivTwo().theMax(board));
		}
		case 2: {
			String[] board = { "0101001", "1101011" };
			int expected__ = 9;

			return verifyCase(casenum__, expected__,
					new XorBoardDivTwo().theMax(board));
		}
		case 3: {
			String[] board = { "000", "001", "010", "011", "100", "101", "110",
					"111" };
			int expected__ = 15;

			return verifyCase(casenum__, expected__,
					new XorBoardDivTwo().theMax(board));
		}
		case 4: {
			String[] board = { "000000000000000000000000",
					"011111100111111001111110", "010000000100000001000000",
					"010000000100000001000000", "010000000100000001000000",
					"011111100111111001111110", "000000100000001000000010",
					"000000100000001000000010", "000000100000001000000010",
					"011111100111111001111110", "000000000000000000000000" };
			int expected__ = 105;

			return verifyCase(casenum__, expected__,
					new XorBoardDivTwo().theMax(board));
		}

		// custom cases

		/*
		 * case 5: { String[] board = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * XorBoardDivTwo().theMax(board)); }
		 */
		/*
		 * case 6: { String[] board = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * XorBoardDivTwo().theMax(board)); }
		 */
		/*
		 * case 7: { String[] board = ; int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * XorBoardDivTwo().theMax(board)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
