
public class BallAndHats {
   public int getHat(String hats, int numSwaps) {
	   int pos=0;
		for (int i = 0; i < hats.length(); i++) {
			if(hats.charAt(i)=='o'){
				pos=i;
			}
		}
		if(numSwaps==0) return pos;
		if(numSwaps%2==0)return Math.min(Math.abs(pos-2)%2,(pos+2)%2);
		return Math.min(Math.abs(pos-1)%2,(pos+1)%2);
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			BallAndHatsHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				BallAndHatsHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class BallAndHatsHarness {
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
	
	static boolean compareOutput(int expected, int result) { return expected == result; }
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
		switch(casenum__) {
		case 0: {
			String hats               = ".o.";
			int numSwaps              = 1;
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}
		case 1: {
			String hats               = "..o";
			int numSwaps              = 0;
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}
		case 2: {
			String hats               = "o..";
			int numSwaps              = 1;
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}
		case 3: {
			String hats               = "..o";
			int numSwaps              = 2;
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}
		case 4: {
			String hats               = "o..";
			int numSwaps              = 101;
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}

		// custom cases

     case 5: {
			String hats               = "o..";
			int numSwaps              = 2;
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}
/*      case 6: {
			String hats               = ;
			int numSwaps              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}*/
/*      case 7: {
			String hats               = ;
			int numSwaps              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new BallAndHats().getHat(hats, numSwaps));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
