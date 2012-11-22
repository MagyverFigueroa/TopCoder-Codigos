
public class Workshop {
   public int pictureFrames(int[] pieces) {
	   int ans=0;
	   for (int i = 0; i < pieces.length-2; i++) {
		for (int j = i+1; j < pieces.length-1; j++) {
			for (int k = j+1; k < pieces.length; k++) {
				if(pieces[i]+pieces[j]>pieces[k])
					if(pieces[k]+pieces[j]>pieces[i])
						if(pieces[i]+pieces[k]>pieces[j])ans++;
			}
		}
	}
		return ans;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			WorkshopHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				WorkshopHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class WorkshopHarness {
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
			int[] pieces              = {1,2,3,4,5};
			int expected__            = 3;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}
		case 1: {
			int[] pieces              = {8,5,3};
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}
		case 2: {
			int[] pieces              = {4,23,76,22,87,3,1,99};
			int expected__            = 7;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}
		case 3: {
			int[] pieces              = {10000,9999,9998,9997,9996,1,2,3,4,5};
			int expected__            = 43;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}
		case 4: {
			int[] pieces              = {100};
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}

		// custom cases

/*      case 5: {
			int[] pieces              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}*/
/*      case 6: {
			int[] pieces              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}*/
/*      case 7: {
			int[] pieces              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Workshop().pictureFrames(pieces));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
