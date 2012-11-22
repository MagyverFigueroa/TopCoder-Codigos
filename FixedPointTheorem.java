// Paste me into the FileEdit configuration dialog

public class FixedPointTheorem {
   public double cycleRange(double R) {
		double x = .25;
		for(int i = 0; i < 200000; i++) {
			x = R * x * (1 - x);
		}
		double mayor = 0;
		double menor = 1;
		for(int j = 0; j < 1000; j++) {
			x = R * x * (1 - x);
			mayor = Math.max(mayor, x);
			menor = Math.min(menor, x);
		}
		return mayor - menor;
   
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			FixedPointTheoremHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				FixedPointTheoremHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class FixedPointTheoremHarness {
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
			double R                  = 0.1;
			double expected__         = 0.0;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}
		case 1: {
			double R                  = 3.05;
			double expected__         = 0.14754098360655865;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}
		case 2: {
			double R                  = 3.4499;
			double expected__         = 0.4175631735867292;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}
		case 3: {
			double R                  = 3.55;
			double expected__         = 0.5325704489850351;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}
		case 4: {
			double R                  = 3.565;
			double expected__         = 0.5454276003030636;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}
		case 5: {
			double R                  = 3.5689;
			double expected__         = 0.5489996297493569;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}
		case 6: {
			double R                  = 3.00005;
			double expected__         = 0.004713996108955176;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}

		// custom cases

/*      case 7: {
			double R                  = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}*/
/*      case 8: {
			double R                  = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}*/
/*      case 9: {
			double R                  = ;
			double expected__         = ;

			return verifyCase(casenum__, expected__, new FixedPointTheorem().cycleRange(R));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
