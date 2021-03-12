
public class TestProgram {

	public static void main(String[] args) {
		
		SlopeRanker sr;
		ArrayOrderedList<Slope> ranks;
		
		// --------------- Test 1 ---------------

		boolean test1Success = false;

		sr = new SlopeRanker(TreeData.tree1Data);
		ranks = sr.getRanks();

		if (ranks.toString().trim().equals("0, 4, 1.\t(5)\n0, 2, 4.\t(6)\n0, 4, 2.\t(6)")) {
			test1Success = true;
		}

		if (test1Success) {
			System.out.println("Test 1 passed");
		} else {
			System.out.println("Test 1 failed");
		}

		// --------------- Test 2 ---------------

		boolean test2Success = false;

		sr = new SlopeRanker(TreeData.tree2Data);
		ranks = sr.getRanks();

		if (ranks.toString().trim().equals("1, 3, 0.\t(4)\n1, 3, 4, 0.\t(8)\n1, 3, 4, 1.\t(9)\n1, 3, 3.\t(10)")) {
			test2Success = true;
		}
		
		if (test2Success) {
			System.out.println("Test 2 passed");
		} else {
			System.out.println("Test 2 failed");
		}

		// --------------- Test 3 ---------------

		boolean test3Success = false;

		sr = new SlopeRanker(TreeData.tree3Data);
		ranks = sr.getRanks();

		if (ranks.toString().trim().equals("1, 0, 4, 1.\t(6)\n1, 2, 2, 0.\t(7)\n1, 2, 4, 0.\t(7)\n1, 0, 3, 4.\t(8)\n1, 2, 4, 3.\t(10)\n1, 2, 2, 2.\t(13)")) {
			test3Success = true;
		}
		
		if (test3Success) {
			System.out.println("Test 3 passed");
		} else {
			System.out.println("Test 3 failed");
		}

		// --------------- Test 4 ---------------

		boolean test4Success = false;

		sr = new SlopeRanker(TreeData.tree4Data);
		ranks = sr.getRanks();

		if (ranks.toString().trim().equals("0, 0, 0, 0, 0.\t(0)\n0, 0, 3.\t(3)\n0, 2, 1.\t(3)\n0, 2, 4.\t(6)")) {
			test4Success = true;
		}

		if (test4Success) {
			System.out.println("Test 4 passed");
		} else {
			System.out.println("Test 4 failed");
		}

		// --------------- Test 5 ---------------

		boolean test5Success = false;

		sr = new SlopeRanker(TreeData.tree5Data);
		ranks = sr.getRanks();

		if (ranks.toString().trim().equals("4, 2, 1, 0.\t(7)\n4, 2, 1, 1.\t(9)\n4, 2, 3, 1.\t(10)\n4, 2, 3, 2.\t(11)\n4, 4.\t(12)")) {
			test5Success = true;
		}
		
		if (test5Success) {
			System.out.println("Test 5 passed");
		} else {
			System.out.println("Test 5 failed");
		}

	}

}
