/*
 * Q1. ���� �޼ҵ�� int�� 1���� �迭�� ����� ���� �� ��° �Ű������� ���޵� ���� ũ�⸸ŭ ���� ������Ų��.
 * 		public static void addOneDArr(int[] arr, int add){
 * 			for(int i = 0; i < arr.length; i++)
 * 				arr[i] += add;
 * 		}
 * 		�� �޼ҵ带 ȣ���ϴ� ���·�, int�� 2���� �迭�� ����� �� ���θ� �� ��° �Ű������� ���޵� ���� ũ�⸸ŭ 
 * 		������Ű�� �޼ҵ带 ������ ���·� ��������.
 * 		public static void addTwoDArr(int [][] arr, int add){
 * 			//�� �ȿ��� addOneDArr �޼ҵ带 ȣ���Ѵ�.
 * */
public class Q1_309p {
	public static void addOneDArr(int[] arr, int add) {
		for(int i = 0; i<arr.length;i++) {
			arr[i] += add;
		}
	}
	public static void addTwoDArr(int [][] arr, int add) {
		
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
 