
public class ArrayApp {

	public static void main(String[] args) {
		
		// 배열
		// String users = "egoing, jinhuck, youbin";
		String[] users = new String[3]; // 갯수는 1부터
		users[0] = "usr1"; // 카운트는 0부터
		users[1] = "usr2";
		users[2] = "usr3";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100}; // 원소, element
		System.out.println(scores[1]);
		System.out.println(scores.length);

	}

}
