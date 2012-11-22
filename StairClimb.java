
public class StairClimb {
   public int stridesTaken(int[] flights, int stairsPerStride) {
		int ans=0;
		
		for (int i = 0; i < flights.length; i++) {
			ans+=(int)(flights[i]/stairsPerStride) +2;
			if((flights[i]%stairsPerStride)!=0)ans+=1;
			
		}
		return ans-2;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			StairClimbHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				StairClimbHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class StairClimbHarness {
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
			int[] flights             = {15};
			int stairsPerStride       = 2;
			int expected__            = 8;

			return verifyCase(casenum__, expected__, new StairClimb().stridesTaken(flights, stairsPerStride));
		}
		case 1: {
			int[] flights             = {15,15};
			int stairsPerStride       = 2;
			int expected__            = 18;

			return verifyCase(casenum__, expected__, new StairClimb().stridesTaken(flights, stairsPerStride));
		}
		case 2: {
			int[] flights             = {5,11,9,13,8,30,14};
			int stairsPerStride       = 3;
			int expected__            = 44;

			return verifyCase(casenum__, expected__, new StairClimb().stridesTaken(flights, stairsPerStride));
		}

		// custom cases

/*      case 3: {
			int[] flights             = ;
			int stairsPerStride       = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new StairClimb().stridesTaken(flights, stairsPerStride));
		}*/
/*      case 4: {
			int[] flights             = ;
			int stairsPerStride       = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new StairClimb().stridesTaken(flights, stairsPerStride));
		}*/
/*      case 5: {
			int[] flights             = ;
			int stairsPerStride       = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new StairClimb().stridesTaken(flights, stairsPerStride));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
