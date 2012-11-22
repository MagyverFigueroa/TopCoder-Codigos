import java.util.Arrays;


public class SkipRope {
   public int[] partners(int[] candidates, int height) {
	   Arrays.sort(candidates);
	   int ar[]=new int[2];
	   for (int i = 0; i < candidates.length; i++) {
		if(height>=candidates[i]){
			ar[0]=candidates[i];
			ar[1]=candidates[i+1];

		}
	}
	   return  ar;
	   
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			SkipRopeHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				SkipRopeHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class SkipRopeHarness {
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
			int[] candidates          = {102, 99, 104};
			int height                = 100;
			int[] expected__          = { 99, 102 };

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}
		case 1: {
			int[] candidates          = {102, 97, 104};
			int height                = 100;
			int[] expected__          = { 97, 102 };

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}
		case 2: {
			int[] candidates          = {101, 100, 99};
			int height                = 100;
			int[] expected__          = { 100, 101 };

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}
		case 3: {
			int[] candidates          = {75, 117, 170, 175, 168, 167, 167, 142, 170, 85, 89, 170};
			int height                = 169;
			int[] expected__          = { 170, 170 };

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}
		case 4: {
			int[] candidates          = {134, 79, 164, 86, 131, 78, 99, 150, 105, 163, 150, 110, 90, 137, 127, 130, 121, 93, 97, 131, 170, 137, 171, 153, 137, 138, 92, 103, 149, 110, 156};
			int height                = 82;
			int[] expected__          = { 79, 86 };

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}

		// custom cases

/*      case 5: {
			int[] candidates          = ;
			int height                = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}*/
/*      case 6: {
			int[] candidates          = ;
			int height                = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}*/
/*      case 7: {
			int[] candidates          = ;
			int height                = ;
			int[] expected__          = ;

			return verifyCase(casenum__, expected__, new SkipRope().partners(candidates, height));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
