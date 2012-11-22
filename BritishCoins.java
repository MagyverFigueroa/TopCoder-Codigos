
public class BritishCoins {
   public int[] coins(int pence) {
		int arreglo[]= new int [3];
		
	
		   while(pence>=240){
			   arreglo[0]++;
			   pence-=240;
		   }
		   while(pence>=12){
			   arreglo[1]++;
			   pence-=12;
		   }
		arreglo[2]=pence;
		
	   return arreglo;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			BritishCoinsHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				BritishCoinsHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class BritishCoinsHarness {
	public static void run_test(int casenum) {
		if (casenum != -1) {
			if (runTestCase(casenum) == -1)
				System.err.println("Illegal input! Test case " + casenum + " does not exist.");
			return;
		}
		
		int correct = 0, total = 0;
		for (int i=0;; ++i) {
			int x = runTestCase(i);
			if (x == -1) {
				if (i >= 100) break;
				continue;
			}
			correct += x;
			++total;
		}
		
		if (total == 0) {
			System.err.println("No test cases run.");
		} else if (correct < total) {
			System.err.println("Some cases FAILED (passed " + correct + " of " + total + ").");
		} else {
			System.err.println("All " + total + " tests passed!");
		}
	}
	
	static boolean compareOutput(int[] expected, int[] result) { if (expected.length != result.length) return false; for (int i=0; i<expected.length; ++i) if (expected[i] != result[i]) return false; return true; }

	static String formatResult(int[] res) {
		String ret = "";
		ret += "{";
		for (int i=0; i<res.length; ++i) {
			if (i > 0) ret += ",";
			ret += String.format(" %d", res[i]);
		}
		ret += " }";
		return ret;
	}
	
	static int verifyCase(int casenum, int[] expected, int[] received) { 
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
		switch(casenum__) {
		case 0: {
			int pence                 = 533;
			int[] expected__          = { 2, 4, 5 };

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}
		case 1: {
			int pence                 = 0;
			int[] expected__          = { 0, 0, 0 };

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}
		case 2: {
			int pence                 = 6;
			int[] expected__          = { 0, 0, 6 };

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}
		case 3: {
			int pence                 = 4091;
			int[] expected__          = { 17, 0, 11 };

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}
		case 4: {
			int pence                 = 10000;
			int[] expected__          = { 41, 13, 4 };

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}

		// custom cases

/*      case 5: {
			int pence                 = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}*/
/*      case 6: {
			int pence                 = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}*/
/*      case 7: {
			int pence                 = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new BritishCoins().coins(pence));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
