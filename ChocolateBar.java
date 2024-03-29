// Paste me into the FileEdit configuration dialog

public class ChocolateBar {
	public boolean repeat(String s){
		int arreglo[]=new int[26];
		for(int i=0;i<s.length();i++){
			arreglo[s.charAt(i)-'a']++;
		}
		for(int j=0;j<26;j++){
			if(arreglo[j]>=2)return true;
		}
		return false;
	}
   public int maxLength(String letters) {
		
		int n=0;
		
		String cadenita="";
		for(int i=0;i<letters.length();i++){
		for(int j=i;j<=letters.length();j++){
			cadenita=letters.substring(i, j);
			if(!repeat(cadenita))n=Math.max(n, cadenita.length());
		}
		}
		
		
		return n;
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			ChocolateBarHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				ChocolateBarHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class ChocolateBarHarness {
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
			String letters            = "srm";
			int expected__            = 3;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}
		case 1: {
			String letters            = "dengklek";
			int expected__            = 6;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}
		case 2: {
			String letters            = "haha";
			int expected__            = 2;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}
		case 3: {
			String letters            = "www";
			int expected__            = 1;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}
		case 4: {
			String letters            = "thisisansrmbeforetopcoderopenfinals";
			int expected__            = 9;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}

		// custom cases

/*      case 5: {
			String letters            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}*/
/*      case 6: {
			String letters            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}*/
/*      case 7: {
			String letters            = ;
			int expected__            = ;

			return verifyCase(casenum__, expected__, new ChocolateBar().maxLength(letters));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
