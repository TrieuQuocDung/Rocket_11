package Ex2Exception;

public class Question1A2 {
	public static void main(String[] args) {
		try {
			float result = devide (7,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("cannot divide 0");
		}
		finally {
			System.out.println("divide  completed!");
		}
	}

	public static float devide(int i, int j) {
		
		return i / j;
	}
}
