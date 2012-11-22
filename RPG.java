
public class RPG {
   public int[] dieRolls(String[] dice) {
	int a=0,b=0,c=0;
	
	   for (int i = 0; i < dice.length; i++) {
		   
		for (int j = 0; j < dice[i].length()-1; j++) {
			
			if ((dice[i].charAt(j)+"").equalsIgnoreCase("d"))c=j;
			
		}

		a+=Integer.parseInt(dice[i].substring(0, c));
		b+=Integer.parseInt(dice[i].substring(0, c))*Integer.parseInt(dice[i].substring(c+1, dice[i].length()));
	}	
	
	   int arreglo[]={a,b,(a+b)/2};
	   return arreglo;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			RPGHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				RPGHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class RPGHarness {
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
	
	static boolean compareOutput(int[] expected, int[] result) { if (expected.length != result.length) return false; for (int i=0; i<expected.length; ++i) if (expected[i] != result[i]) return false; return true; }

	static String formatResult(int[] res) {
		String ret = "";
		ret += "{";
		for (int i=0; i<res.length; ++i) {
			if (i > 0) ret += ",";
			ret += String.format(" %d", res[i]);
		}
		ret += " }";
		return ret;
	}
	
	static int verifyCase(int casenum, int[] expected, int[] received) { 
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
			String[] dice             = {"3d6"};
			int[] expected__          = { 3, 18, 10 };

			return verifyCase(casenum__, expected__, new RPG().dieRolls(dice));
		}
		case 1: {
			String[] dice             = {"3d4","1d6"};
			int[] expected__          = { 4, 18, 11 };

			return verifyCase(casenum__, expected__, new RPG().dieRolls(dice));
		}
		case 2: {
			String[] dice             = {"6d5","10d10","10d20"};
			int[] expected__          = { 26, 330, 178 };

			return verifyCase(casenum__, expected__, new RPG().dieRolls(dice));
		}
		case 3: {
			String[] dice             = {"1d2","2d2","4d2","6d2","8d2"};
			int[] expected__          = { 21, 42, 31 };

			return verifyCase(casenum__, expected__, new RPG().dieRolls(dice));
		}

		// custom cases

/*      case 4: {
			String[] dice             = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new RPG().dieRolls(dice));
		}*/
/*      case 5: {
			String[] dice             = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new RPG().dieRolls(dice));
		}*/
/*      case 6: {
			String[] dice             = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new RPG().dieRolls(dice));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
