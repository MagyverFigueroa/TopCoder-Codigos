
public class LevelUp {
   public int toNextLevel(int[] expNeeded, int received) {
		int nivel=0, falta=0;
	   for (int i = 0; i < expNeeded.length; i++) {
			if(received<=expNeeded[i]){
				nivel=i;break;
			}
		}
	   

	   if(expNeeded[nivel]>received)falta=expNeeded[nivel]-received; 
	   if(expNeeded[nivel]==received)falta=expNeeded[nivel+1]-received; 
	   else if(expNeeded[nivel]==received)falta=expNeeded[nivel+1]-expNeeded[nivel]-received; 
	   return falta;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			LevelUpHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				LevelUpHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class LevelUpHarness {
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
			int[] expNeeded           = {150,450,900,1800};
			int received              = 133;
			int expected__            = 17;

			return verifyCase(casenum__, expected__, new LevelUp().toNextLevel(expNeeded, received));
		}
		case 1: {
			int[] expNeeded           = {150,450,900,1800};
			int received              = 312;
			int expected__            = 138;

			return verifyCase(casenum__, expected__, new LevelUp().toNextLevel(expNeeded, received));
		}
		case 2: {
			int[] expNeeded           = {150,450,900,1800};
			int received              = 612;
			int expected__            = 288;

			return verifyCase(casenum__, expected__, new LevelUp().toNextLevel(expNeeded, received));
		}
		case 3: {
			int[] expNeeded           = {150,450,900,1800};
			int received              = 450;
			int expected__            = 450;

			return verifyCase(casenum__, expected__, new LevelUp().toNextLevel(expNeeded, received));
		}

		// custom cases

/*      case 4: {
			int[] expNeeded           = ;
			int received              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new LevelUp().toNextLevel(expNeeded, received));
		}*/
/*      case 5: {
			int[] expNeeded           = ;
			int received              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new LevelUp().toNextLevel(expNeeded, received));
		}*/
/*      case 6: {
			int[] expNeeded           = ;
			int received              = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new LevelUp().toNextLevel(expNeeded, received));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
