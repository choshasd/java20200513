
public class CarMain {
	public CarMain() {
		KiaCar kc = new KiaCar();
		SamsungCar sc = new SamsungCar();
		HyundaiCar hc = new HyundaiCar();
		kc.name = "K7";
		kc.name2 = "K9";
		kc.tellInfo();
		sc.name = "sm3";
		sc.name2 = "sm5";
		sc.tellInfo();
		hc.name ="EQ900";
		hc.name2 = "GV 80";
		hc.tellInfo();
		
	}
	public static void main(String[] args) {
		new CarMain();
	}
}
