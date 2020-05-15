/*
 * Q2. 다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자/.
 * 		1	2	3	1행  
 * 		4	5	6	2행
 * 		7	8	9	3행
 * 		이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는
 * 		메소드를 정의하자
 * 		7	8	9	1행
 * 		1	2	3	2행	
 * 		4	5	6	3행
 * 		물론 배열의 가로와 세로 길이에 상관없이 위와 같이 동작하도록 메소드를 정의해야한다.
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

        System.out.println("1차 shift...");
        shiftTwoDArr(arr);
        showTwoDArr(arr);
        
        System.out.println("2차 shift...");
        shiftTwoDArr(arr);
        showTwoDArr(arr);

        System.out.println("3차 shift...");
	shiftTwoDArr(arr);
	showTwoDArr(arr);
    }
}

 * */

