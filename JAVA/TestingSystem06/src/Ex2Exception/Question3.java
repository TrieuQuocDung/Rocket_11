package Ex2Exception;

public class Question3 {
	public static void main(String[] args) {
		
		try {
			int[] numbers = {1,2,3};
			
			System.out.println(numbers[10]);
		} catch (Exception e) {
			System.out.println("Insert up to 3!");
		}
		finally {
			System.out.println("insert completed!");
		}
	}
}
