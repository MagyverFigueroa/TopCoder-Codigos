
public class EyeDrops {
   public double closest(int sleepTime, int k) {
		double n=(24.0*60.0)/k;
	   if (n<(sleepTime*60.0))return (24-sleepTime)*60.0/(k-1);
	   return n;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			EyeDropsHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				EyeDropsHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class EyeDropsHarness {
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
	
	static final double MAX_DOUBLE_ERROR = 1E-9;
	static boolean compareOutput(double expected, double result){ if(Double.isNaN(expected)){ return Double.isNaN(result); }else if(Double.isInfinite(expected)){ if(expected > 0){ return result > 0 && Double.isInfinite(result); }else{ return result < 0 && Double.isInfinite(result); } }else if(Double.isNaN(result) || Double.isInfinite(result)){ return false; }else if(Math.abs(result - expected) < MAX_DOUBLE_ERROR){ return true; }else{ double min = Math.min(expected * (1.0 - MAX_DOUBLE_ERROR), expected * (1.0 + MAX_DOUBLE_ERROR)); double max = Math.max(expected * (1.0 - MAX_DOUBLE_ERROR), expected * (1.0 + MAX_DOUBLE_ERROR)); return result > min && result < max; } }
	static double relativeError(double expected, double result) { if (Double.isNaN(expected) || Double.isInfinite(expected) || Double.isNaN(result) || Double.isInfinite(result) || expected == 0) return 0; return Math.abs(result-expected) / Math.abs(expected); }
	
	static String formatResult(double res) {
		return String.format("%.10g", res);
	}
	
	static int verifyCase(int casenum, double expected, double received) { 
		System.err.print("Example " + casenum + "... ");
		if (compareOutput(expected, received)) {
			System.err.print("PASSED");
			double rerr = relativeError(expected, received);
			if (rerr > 0) System.err.printf(" (relative error %g)", rerr);
			System.err.println();
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
			int sleepTime             = 8;
			int k                     = 2;
			double expected__         = 720.0;

			return verifyCase(casenum__, expected__, new EyeDrops().closest(sleepTime, k));
		}
		case 1: {
			int sleepTime             = 9;
			int k                     = 3;
			double expected__         = 450.0;

			return verifyCase(casenum__, expected__, new EyeDrops().closest(sleepTime, k));
		}
		case 2: {
			int sleepTime             = 23;
			int k                     = 1;
			double expected__         = 1440.0;

			return verifyCase(casenum__, expected__, new EyeDrops().closest(sleepTime, k));
		}
		case 3: {
			int sleepTime             = 9;
			int k                     = 8;
			double expected__         = 128.57142857142856;

			return verifyCase(casenum__, expected__, new EyeDrops().closest(sleepTime, k));
		}

		// custom cases

    case 4: {
			int sleepTime             = 0;
			int k                     = 50;
			double expected__         =28.799999999999997 ;

			return verifyCase(casenum__, expected__, new EyeDrops().closest(sleepTime, k));
		}
/*      case 5: {
			int sleepTime             = ;
			int k                     = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new EyeDrops().closest(sleepTime, k));
		}*/
/*      case 6: {
			int sleepTime             = ;
			int k                     = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new EyeDrops().closest(sleepTime, k));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
