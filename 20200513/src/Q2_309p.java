/*
 * Q2. ���� ���·� ǥ���� 2���� �迭�� �����Ѵٰ� �����غ���/.
 * 		1	2	3	1��  
 * 		4	5	6	2��
 * 		7	8	9	3��
 * 		�̷��� ���¸� ���� int�� 2���� �迭�� ���ڷ� ���޵Ǹ�, ������ ���·� �迭�� ������ �����Ű��
 * 		�޼ҵ带 ��������
 * 		7	8	9	1��
 * 		1	2	3	2��	
 * 		4	5	6	3��
 * 		���� �迭�� ���ο� ���� ���̿� ������� ���� ���� �����ϵ��� �޼ҵ带 �����ؾ��Ѵ�.
 * */
/*
1	2	3			10	11	12
4	5	6			1	2	3	
7   8  9			4	5	6
10 11 12			7	8	9
*/
public class Q2_309p {
	public static void main(String[] args) {
		int [][] arrA = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9,11},
			{10,11,12},
		};
		int [][] arrB = new int[100][100];
		int a = (arrA.length)-1; 
		
		for(int j = 0;j<a;j++) { 
			for(int i = 0;i<arrA[0].length;i++) {
				arrB[0][i] = arrA[a][i];
				arrB[a-j][i] = arrA[a-(j+1)][i];				
			}
		}
		
		for(int i = 0; i<arrA.length;i ++) {
			for(int j = 0; j< arrA[0].length;j++) {
				System.out.print(arrB[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
/*
 * class ShiftArray {
    public static void shiftTwoDArr(int[][] arr) {
        int[] lastLow = arr[arr.length - 1];

        for(int low = arr.length - 1; low > 0; low--)
            arr[low] = arr[low - 1];
        
        arr[0] = lastLow;
    }
    
    public static void showTwoDArr(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("1�� shift...");
        shiftTwoDArr(arr);
        showTwoDArr(arr);
        
        System.out.println("2�� shift...");
        shiftTwoDArr(arr);
        showTwoDArr(arr);

        System.out.println("3�� shift...");
	shiftTwoDArr(arr);
	showTwoDArr(arr);
    }
}

 * */

