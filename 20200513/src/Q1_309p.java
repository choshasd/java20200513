/*
 * Q1. 다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
 * 		public static void addOneDArr(int[] arr, int add){
 * 			for(int i = 0; i < arr.length; i++)
 * 				arr[i] += add;
 * 		}
 * 		위 메소드를 호출하는 형태로, int형 2차원 배열에 저장된 값 전부를 두 번째 매개변수로 전달된 값의 크기만큼 
 * 		증가시키는 메소드를 다음의 형태로 정의하자.
 * 		public static void addTwoDArr(int [][] arr, int add){
 * 			//이 안에서 addOneDArr 메소드를 호출한다.
 * */
class ArrayCalu{
	public static void addOneArr(int[] arr, int add) {
		for(int i = 0; i<arr.length;i++) {
			arr[i] += add;
		}
	
	}
	public static void addTwoArr(int [][] arr, int add) {

		for(int i=0; i<arr.length;i++) {
			//같은 클래스 안에 있기때문에 addOneArr(arr[i],add)만 해도됨
			ArrayCalu.addOneArr(arr[i],add);
		}
	}
	public static void doPrint(int[][] arr) {
		for(int i = 0; i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			
			}
			System.out.println();
		}
	}
}

public class Q1_309p {
	public static void main(String[] args) {		
		// 위에 static 선언하면 이 구문 안해도됨 -> ArrayCalu ac = new ArrayCalu();	
//		ArrayCalu.addOneArr(null, 0);
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayCalu.addTwoArr(arr, 3);
		ArrayCalu.doPrint(arr);
	}
}
/*
 * class TwoDimensionalArrayAdder {
    public static void addOneDArr(int[] arr, int add) { 
        for(int i = 0; i < arr.length; i++)
            arr[i] += add;
    }
    
    public static void addTwoDArr(int[][] arr, int add) {
        for(int i = 0; i < arr.length; i++)
            addOneDArr(arr[i], add);
    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        addTwoDArr(arr, 2);
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
 * */
 