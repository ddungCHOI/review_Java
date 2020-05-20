class Print {
	public String delimiter;
	public Print(String delimiter) {
		this.delimiter = delimiter; // this.delimiter는 인스턴스 변수 (바로 위에 선언한 변수)를 가리킴
	}
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
		
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}
public class staticMethod {
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		
		Print t1 = new Print("-"); // 인스턴스 생성
		//t1.delimiter = "-";
		t1.a(); // 인스턴스를 사용한다면 static을 지워야함
		t1.b();
		Print.c("$");
		
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print("*");
		//t2.delimiter = "*";
		t2.a();
		t2.b();
	}
	

}
