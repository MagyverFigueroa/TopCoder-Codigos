// Paste me into the FileEdit configuration dialog

public class Substitute {
   public int getValue(String key, String code) {
		String arreglo[]= new String[key.length()];
		int n=0;
		
		for(int j=0;j<key.length();j++){
			arreglo[j]=key.charAt(j)+"";
			 
		}
		
		for(int i=0;i<code.length();i++){
			for(int k=0;k<arreglo.length;k++){
				if((code.charAt(i)+"").equals(arreglo[k]))n=n*10+(k+1)%10;
			}
		}
			
		
		return n;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			SubstituteHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				SubstituteHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class SubstituteHarness {
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
			String key                = "TRADINGFEW";
			String code               = "LGXWEV";
			int expected__            = 709;

			return verifyCase(casenum__, expected__, new Substitute().getValue(key, code));
		}
		case 1: {
			String key                = "ABCDEFGHIJ";
			String code               = "XJ";
			int expected__            = 0;

			return verifyCase(casenum__, expected__, new Substitute().getValue(key, code));
		}
		case 2: {
			String key                = "CRYSTALBUM";
			String code               = "MMA";
			int expected__            = 6;

			return verifyCase(casenum__, expected__, new Substitute().getValue(key, code));
		}

		// custom cases

/*      case 3: {
			String key                = ;
			String code               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Substitute().getValue(key, code));
		}*/
/*      case 4: {
			String key                = ;
			String code               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Substitute().getValue(key, code));
		}*/
/*      case 5: {
			String key                = ;
			String code               = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new Substitute().getValue(key, code));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
