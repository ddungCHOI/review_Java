class Print {
	public String delimiter = ""; // 전역 변수 : main 메소드 밖 & 전체 클래스 안에서 선언

	// 생성자 → 클래스와 이름이 같은 메소드를 정의함
    // 이 메소드는 나중에 인스턴트 생성 시 자동 호출 (하지만 Construct 함수에서 인자를 무조건 받아야함, Print t2 = new Print("*");)
	public Print(String delimiter) {
		this.delimiter = delimiter; // this.delimiter는 인스턴스 변수 (바로 위에 선언한 변수)를 가리킴
	}
	public void A() {
		System.out.println(this.delimiter); // 명시적으로
		System.out.println("A");
		System.out.println("A");
	}

	public void B() {
		System.out.println(this.delimiter); // 명시적으로
		System.out.println("B");
		System.out.println("B");
	}
}