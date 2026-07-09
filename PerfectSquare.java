public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(Integer.MAX_VALUE / 100));
        System.out.println(isPerfectSquare(255));
    }

    public static boolean isPerfectSquare(int num) {

        for (int i = 1; i < num; i++) {

          // Check if i squared equals the number.
          if (i * i == num)
              return true;

          // If i squared is greater than the number,
          // it cannot be a perfect square.
          else if (i * i > num)
              return false;
        }

        // Return false if no perfect square was found.
        return false;

		// Explanation:
		// This exercise helped me practice debugging Java code and working with
		// methods that return boolean values. I learned that the assignment operator
		// (=) cannot be used to compare values, and that I must use the equality
		// operator (==) instead. I learned that every possible path in a method
		// with a return type must return a value, so I added a final return false
		// statement after the loop. In the future, I will remember to carefully
		// distinguish between = and ==, and to make sure all methods return the
		// correct value in every situation.
    }
}
