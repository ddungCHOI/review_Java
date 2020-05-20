class Accounting{
	// 클래스화 : 비슷한 기능을 하는 메소드들을 그룹
	public double valueOfSupply;
	public static double vatRate = 0.1;
	// valueOfSupply를 매번 변경해야 하지만 꼭 필요하므로 생성자로 만든다. 생성자는 메소드명이 클래스명과 같은 메소드
    public Accounting(double valueOfSupply) {
    	this.valueOfSupply = valueOfSupply; // this.valueOfSupply 는 인스턴스 변수를 가리킴 → this는 인스턴스를 가리킴
    }
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0);
		
		Accounting a2 = new Accounting(20000.0);
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
		
 
    }
}