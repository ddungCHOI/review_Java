import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	
	public static void main(String[] args) throws IOException { 
		//인자, arguments (매개변수의 구체적인 값)
			System.out.println(twoTimes("a", "-"));
			FileWriter fw = new FileWriter("out.txt");
			fw.write(twoTimes("a", "*"));
			fw.close();
//			Email.send("egoing@a.com", "two times a", twoTimes("a", "&"));

	}

	public static String twoTimes(String text, String delimiter) {
		//매개변수(parameter) 자리에 변수 선언 및 지정
		//return값 → void가 아닌 리턴값의 type 설정
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out; //메소드의 실행 결과
	}
					
}
