public class PlatypusDuckAndBeaver {
	public int minimumAnimals(int webbedFeet, int duckBills, int beaverTails) {
		int platypus=Math.min(webbedFeet/4,Math.min(duckBills,beaverTails));
		webbedFeet=webbedFeet-platypus*4;
		duckBills=duckBills-platypus;
		beaverTails=beaverTails-platypus;
		int beaver=Math.min(webbedFeet/4,beaverTails);
		webbedFeet-=beaver*4;
		int duck=Math.max(webbedFeet/2, duckBills);
		
		return platypus+beaver+duck;
	}

	// BEGIN CUT HERE
	public static void main(String[] args) {
		if (args.length == 0) {
			PlatypusDuckAndBeaverHarness.run_test(-1);
		} else {
			for (int i = 0; i < args.length; ++i)
				PlatypusDuckAndBeaverHarness.run_test(Integer.valueOf(args[i]));
		}
	}
	// END CUT HERE
}

// BEGIN CUT HERE
class PlatypusDuckAndBeaverHarness {
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
			int webbedFeet = 4;
			int duckBills = 1;
			int beaverTails = 1;
			int expected__ = 1;

			return verifyCase(casenum__, expected__,
					new PlatypusDuckAndBeaver().minimumAnimals(webbedFeet,
							duckBills, beaverTails));
		}
		case 1: {
			int webbedFeet = 0;
			int duckBills = 0;
			int beaverTails = 0;
			int expected__ = 0;

			return verifyCase(casenum__, expected__,
					new PlatypusDuckAndBeaver().minimumAnimals(webbedFeet,
							duckBills, beaverTails));
		}
		case 2: {
			int webbedFeet = 10;
			int duckBills = 2;
			int beaverTails = 2;
			int expected__ = 3;

			return verifyCase(casenum__, expected__,
					new PlatypusDuckAndBeaver().minimumAnimals(webbedFeet,
							duckBills, beaverTails));
		}
		case 3: {
			int webbedFeet = 60;
			int duckBills = 10;
			int beaverTails = 10;
			int expected__ = 20;

			return verifyCase(casenum__, expected__,
					new PlatypusDuckAndBeaver().minimumAnimals(webbedFeet,
							duckBills, beaverTails));
		}
		case 4: {
			int webbedFeet = 1000;
			int duckBills = 200;
			int beaverTails = 200;
			int expected__ = 300;

			return verifyCase(casenum__, expected__,
					new PlatypusDuckAndBeaver().minimumAnimals(webbedFeet,
							duckBills, beaverTails));
		}

		// custom cases

		/*
		 * case 5: { int webbedFeet = ; int duckBills = ; int beaverTails = ;
		 * int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * PlatypusDuckAndBeaver().minimumAnimals(webbedFeet, duckBills,
		 * beaverTails)); }
		 */
		/*
		 * case 6: { int webbedFeet = ; int duckBills = ; int beaverTails = ;
		 * int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * PlatypusDuckAndBeaver().minimumAnimals(webbedFeet, duckBills,
		 * beaverTails)); }
		 */
		/*
		 * case 7: { int webbedFeet = ; int duckBills = ; int beaverTails = ;
		 * int expected__ = ;
		 * 
		 * return verifyCase(casenum__, expected__, new
		 * PlatypusDuckAndBeaver().minimumAnimals(webbedFeet, duckBills,
		 * beaverTails)); }
		 */
		default:
			return -1;
		}
	}
}

// END CUT HERE
