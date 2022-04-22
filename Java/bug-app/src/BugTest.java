
public class BugTest {

	public static void main(String[] args) {
		try {
			int firstNo = Integer.parseInt(args[0]);
			int secondNo = Integer.parseInt(args[1]);

			int result = firstNo / secondNo;

			System.out.println("Result is :" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bound");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occured");
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occured");
		} catch (Exception e) {
			System.out.println("Super exception caught ");
		} finally {
			System.out.println("Finally Executed");
		}
		System.out.println("End of tht program.");
	}

}
