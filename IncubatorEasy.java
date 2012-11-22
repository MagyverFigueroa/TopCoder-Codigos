import java.util.Arrays;


public class IncubatorEasy {
   public int maxMagicalGirls(String[] love) {
	   int ans=0;
	   int loveTo[][]= new int[love.length][love.length];
	   int isProtected[]=new int[love.length]; 
		for (int i = 0; i < love.length; i++) {
			for (int j = 0; j < love.length; j++) {
				if(love[i].charAt(j)=='Y'){loveTo[i][j]=1;
				isProtected [j]=1; 
				}
			}
		}
		
		for (int k = 0; k < love.length; k++) {
			if(isProtected[k]==0)ans++;
		}
		
		
		return ans;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			IncubatorEasyHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				IncubatorEasyHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class IncubatorEasyHarness {
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
			String[] love             = {"NY","NN"};
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}
		case 1: {
			String[] love             = {"NYN", "NNY", "NNN"};
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}
		case 2: {
			String[] love             = {"NNYNN","NNYNN","NNNYY","NNNNN","NNNNN"};
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}
		case 3: {
			String[] love             = {"NNNNN","NYNNN","NYNYN","YNYNN","NNNNN"};
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}
		case 4: {
			String[] love             = {"NNNNN","NNNNN","NNNNN","NNNNN","NNNNN"};
			int expected__            = 5;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}
		case 5: {
			String[] love             = {"Y"};
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}

		// custom cases

/*      case 6: {
			String[] love             = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}*/
/*      case 7: {
			String[] love             = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}*/
/*      case 8: {
			String[] love             = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new IncubatorEasy().maxMagicalGirls(love));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
