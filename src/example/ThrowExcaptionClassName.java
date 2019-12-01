package example;

public class ThrowExcaptionClassName {
	
	public static void main (String[] args) {
		try {
			execute();
		System.out.println("True");
		}catch(Exception e){
			System.out.println(e.getClass().getName());
		}
	}

	private static void execute() {
		try {
			throw new IllegalArgumentException();
		}catch(Exception e) {
			throw new NullPointerException();
		}finally {
			throw new IndexOutOfBoundsException();
		}
	}
}
