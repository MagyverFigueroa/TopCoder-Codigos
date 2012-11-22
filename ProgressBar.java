
public class ProgressBar {
   public String showProgress(int[] taskTimes, int tasksCompleted) {
	   
	   int suma=0,suma2=0;
		for (int i = 0; i < taskTimes.length; i++) {
			suma2+=taskTimes[i];
			if(i<tasksCompleted)suma+=taskTimes[i];
		}		
		suma=(suma*20)/suma2;
		String cadena="";
		for (int j = 0; j < 20; j++) {
			if(j<suma)cadena+="#";
			else cadena+=".";
		}
	   return cadena;
	   
   }


// BEGIN CUT HERE
   public static void main(String[] args) {
		if (args.length == 0) {
			ProgressBarHarness.run_test(-1);
		} else {
			for (int i=0; i<args.length; ++i)
				ProgressBarHarness.run_test(Integer.valueOf(args[i]));
		}
	}
// END CUT HERE
}

// BEGIN CUT HERE
class ProgressBarHarness {
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
	
	static boolean compareOutput(String expected, String result) { return expected.equals(result); }
	static String formatResult(String res) {
		return String.format("\"%s\"", res);
	}
	
	static int verifyCase(int casenum, String expected, String received) { 
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
			int[] taskTimes           = {19,6,23,17};
			int tasksCompleted        = 3;
			String expected__         = "##############......";

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}
		case 1: {
			int[] taskTimes           = {2,3,7,1,4,3};
			int tasksCompleted        = 4;
			String expected__         = "#############.......";

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}
		case 2: {
			int[] taskTimes           = {553,846,816,203,101,120,161,818,315,772};
			int tasksCompleted        = 4;
			String expected__         = "##########..........";

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}
		case 3: {
			int[] taskTimes           = {7,60,468,489,707,499,350,998,1000,716,457,104,597,583,396,862};
			int tasksCompleted        = 2;
			String expected__         = "....................";

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}
		case 4: {
			int[] taskTimes           = {419,337,853,513,632,861,336,594,94,367,336,297,966,627,399,433,846,859,80,2};
			int tasksCompleted        = 19;
			String expected__         = "###################.";

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}

		// custom cases

/*      case 5: {
			int[] taskTimes           = ;
			int tasksCompleted        = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}*/
/*      case 6: {
			int[] taskTimes           = ;
			int tasksCompleted        = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}*/
/*      case 7: {
			int[] taskTimes           = ;
			int tasksCompleted        = ;
			String expected__         = ;

			return verifyCase(casenum__, expected__, new ProgressBar().showProgress(taskTimes, tasksCompleted));
		}*/
		default:
			return -1;
		}
	}
}

// END CUT HERE
