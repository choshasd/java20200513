class KiaCar extends Car {
/*
 * �ڵ����� �����Ǿ� �����Ǿ�����
	KiaCar(){
		super();
	}
*/	
	public void tellInfo() {
		System.out.println("\" ������ ��ȸ�� \"");
//		System.out.println(this.name);
//		System.out.println(super.name);
		System.out.println("Kia Car 1 = "+name);
		System.out.println("Kia Car 2 = "+name2);
		System.out.println();
	}
}
class SamsungCar extends Car{
	public void tellInfo() {
		System.out.println("\" �Ｚ�� �ڵ������ \"");
		System.out.println("Samsung Car 1 = "+name);
		System.out.println("Samsung Car 2 = "+name2);
		System.out.println();
	}
}
class HyundaiCar extends Car{
	public void tellInfo() {
		System.out.println("\" GV80 ���ʹ� \"");
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
