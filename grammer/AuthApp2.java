
public class AuthApp2 {

	public static void main(String[] args) {
		
		// args가 필요할 때 : javac로 클래스 생성 후 "java AuthApp args1 args2"
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String pass2 = "2222";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass ) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}		

	}

}
