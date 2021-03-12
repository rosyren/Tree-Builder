
public class TestSlopes {

	public static void main(String[] args) {
		ArrayUnorderedList<Trail> trails = new ArrayUnorderedList<Trail>();

		Slope slope;

		// --------------- Test 1 ---------------

		boolean test1Success = false;

		slope = new Slope(trails);

		if (slope.toString().equals("The slope contains no trails.")) {
			test1Success = true;
		}

		if (test1Success) {
			System.out.println("Test 1 passed");
		} else {
			System.out.println("Test 1 failed");
		}


		// --------------- Test 2 ---------------

		boolean test2Success = false;

		trails.addToRear(new Trail("A","rocks"));
		trails.addToRear(new Trail("B","ice"));
		trails.addToRear(new Trail("C","trees"));
		
		slope = new Slope(trails);

		slope.calculateRank();

		if (slope.toString().equals("2, 4, 3.\t(9)")) {
			test2Success = true;
		}
		

		if (test2Success) {
			System.out.println("Test 2 passed");
		} else {
			System.out.println("Test 2 failed");
		}

		// --------------- Test 3 ---------------

		boolean test3Success = false;

		trails.addToRear(new Trail("D","plain"));
		trails.addToRear(new Trail("E","slalom"));
		trails.addToRear(new Trail("F","snow"));

		slope = new Slope(trails);
		slope.calculateRank();

		if (slope.toString().equals("2, 4, 3, 0, 1, 0.\t(10)")) {
			test3Success = true;
		}
		

		if (test3Success) {
			System.out.println("Test 3 passed");
		} else {
			System.out.println("Test 3 failed");
		}


		// --------------- Test 4 ---------------

		boolean test4Success = false;

		trails = new ArrayUnorderedList<Trail>();

		trails.addToRear(new Trail("A","trees"));
		trails.addToRear(new Trail("B","trees"));
		trails.addToRear(new Trail("C","trees"));
		trails.addToRear(new Trail("D","trees"));

		slope = new Slope(trails);

		if (slope.toString().equals("3, 3, 3, 3.\t(0)")) {
			test4Success = true;
		}
		

		if (test4Success) {
			System.out.println("Test 4 passed");
		} else {
			System.out.println("Test 4 failed");
		}

		// --------------- Test 5 ---------------

		boolean test5Success = false;

		slope.calculateRank();

		if (slope.toString().equals("3, 3, 3, 3.\t(30)")) {
			test5Success = true;
		}
		

		if (test5Success) {
			System.out.println("Test 5 passed");
		} else {
			System.out.println("Test 5 failed");
		}

	}

}
