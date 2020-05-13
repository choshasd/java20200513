class KiaCar extends Car {
/*
 * 자동으로 생성되어 생략되어있음
	KiaCar(){
		super();
	}
*/	
	public void tellInfo() {
		System.out.println("\" 현대의 자회사 \"");
//		System.out.println(this.name);
//		System.out.println(super.name);
		System.out.println("Kia Car 1 = "+name);
		System.out.println("Kia Car 2 = "+name2);
		System.out.println();
	}
}
class SamsungCar extends Car{
	public void tellInfo() {
		System.out.println("\" 삼성의 자동차산업 \"");
		System.out.println("Samsung Car 1 = "+name);
		System.out.println("Samsung Car 2 = "+name2);
		System.out.println();
	}
}
class HyundaiCar extends Car{
	public void tellInfo() {
		System.out.println("\" GV80 사고싶다 \"");
		System.out.println("Hyundai Car 1 = "+name);
		System.out.println("Hyundai Car 2 = "+name2);
		System.out.println();
	}
}
public class Car {
/*
 	String name;
 	Car(){}
 	Car(String name){
 	this.name = name;
 	}
 
 */
	String name;
	String name2;
/*	public void tellName() {
		System.out.println("name = "+name);
	}
*/	
}
