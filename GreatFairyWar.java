
public class GreatFairyWar {
   public int minHP(int[] dps, int[] hp) {
		int ans=0;
		int ret=0;
	   for (int i = hp.length-1; i >= 0; i--) {
		  ans+=dps[i];
		   ret+=hp[i]*(ans);
		
	}
	   
	   return ret;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			GreatFairyWarHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				GreatFairyWarHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class GreatFairyWarHarness {
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
			int[] dps                 = {1,2};
			int[] hp                  = {3,4};
			int expected__            = 17;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}
		case 1: {
			int[] dps                 = {1,1,1,1,1,1,1,1,1,1};
			int[] hp                  = {1,1,1,1,1,1,1,1,1,1};
			int expected__            = 55;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}
		case 2: {
			int[] dps                 = {20,12,10,10,23,10};
			int[] hp                  = {5,7,7,5,7,7};
			int expected__            = 1767;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}
		case 3: {
			int[] dps                 = {5,7,7,5,7,7};
			int[] hp                  = {20,12,10,10,23,10};
			int expected__            = 1998;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}
		case 4: {
			int[] dps                 = {30,2,7,4,7,8,21,14,19,12};
			int[] hp                  = {2,27,18,19,14,8,25,13,21,30};
			int expected__            = 11029;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}
		case 5: {
			int[] dps                 = {1};
			int[] hp                  = {1};
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}

		// custom cases


    case 7: {
			int[] dps                 = {1,2,5,8,5};
			int[] hp                  = {7,2,5,6,9};
			int expected__            = 400;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}
/*      case 8: {
			int[] dps                 = ;
			int[] hp                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new GreatFairyWar().minHP(dps, hp));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
