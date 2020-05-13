//배열에서 최대값과 최소값
public class Ex01 {
	Ex01(){
		int arry[] = {1, 34, 20, 2, 10, 34, 290, 30};
		
		int min = arry[0];
		int max = arry[0];
		for(int i: arry) {
			if(i> min) {
				min = i;
			
			}
			if(i < max) {
				max = i;
			}
			
		}
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
