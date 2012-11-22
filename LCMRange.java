import java.util.Arrays;




public class LCMRange {
   public int lcm(int first, int last) {
	   int ans=first;
	   for(int i=first+1;i<=last;i++)
	   ans=ans * (i / GCD(ans, i));
	   
	   
	   return ans;
   }
   
   
  
   
   public int GCD(int a, int b) {
	    if (b == 0) return a;
	    else return (GCD (b, a % b));
	}

// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			LCMRangeHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				LCMRangeHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class LCMRangeHarness {
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
			int first                 = 1;
			int last                  = 5;
			int expected__            = 60;

			return verifyCase(casenum__, expected__, new LCMRange().lcm(first, last));
		}
		case 1: {
			int first                 = 4;
			int last                  = 5;
			int expected__            = 20;

			return verifyCase(casenum__, expected__, new LCMRange().lcm(first, last));
		}
		case 2: {
			int first                 = 1;
			int last                  = 12;
			int expected__            = 27720;

			return verifyCase(casenum__, expected__, new LCMRange().lcm(first, last));
		}

		// custom cases

      case 3: {
			int first                 = 5;
			int last                  = 9;
			int expected__            = 2520;

			return verifyCase(casenum__, expected__, new LCMRange().lcm(first, last));
		}
/*      case 4: {
			int first                 = ;
			int last                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new LCMRange().lcm(first, last));
		}*/
/*      case 5: {
			int first                 = ;
			int last                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new LCMRange().lcm(first, last));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
