class A{
	A(){
		System.out.println("A클래스 생성자");
	}
}
class B extends A{
	B(){
		super(); // 원래 생략되어져있음

		System.out.println("B클래스 생성자");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		new B();
	}
}
