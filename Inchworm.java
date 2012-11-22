
public class Inchworm {
   public int lunchtime(int branch, int rest, int leaf) {
		int brach2[]= new int[branch+1];
		int n=0;
	   for(int i=0;i<=branch;i+=rest){
		   brach2[i]=1;
	   }
	   for(int j=0;j<=branch;j+=leaf){
		   if(brach2[j]==1)n++;
	   }
		
		
		return n;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			InchwormHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				InchwormHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class InchwormHarness {
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
			int branch                = 11;
			int rest                  = 2;
			int leaf                  = 4;
			int expected__            = 3;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}
		case 1: {
			int branch                = 12;
			int rest                  = 6;
			int leaf                  = 4;
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}
		case 2: {
			int branch                = 20;
			int rest                  = 3;
			int leaf                  = 7;
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}
		case 3: {
			int branch                = 21;
			int rest                  = 7;
			int leaf                  = 3;
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}
		case 4: {
			int branch                = 15;
			int rest                  = 16;
			int leaf                  = 5;
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}
		case 5: {
			int branch                = 1000;
			int rest                  = 3;
			int leaf                  = 7;
			int expected__            = 48;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}
		case 6: {
			int branch                = 1000;
			int rest                  = 7;
			int leaf                  = 3;
			int expected__            = 48;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}

		// custom cases

/*      case 7: {
			int branch                = ;
			int rest                  = ;
			int leaf                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}*/
/*      case 8: {
			int branch                = ;
			int rest                  = ;
			int leaf                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}*/
/*      case 9: {
			int branch                = ;
			int rest                  = ;
			int leaf                  = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Inchworm().lunchtime(branch, rest, leaf));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
