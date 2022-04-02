package arrayRotation;

public class ClockwiseRotation {
	
	
	static void printMatrix(int[][] matrix,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	static void transpose(int [][] matrix,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}
	
	
	static void columnSwap(int[][] matrix,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][n-j-1];
				matrix[i][n-j-1]=temp;
			}
		}
	}
	
	
	static void rowSwap(int [][] matrix,int n) {
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				int temp=matrix[i][j];
				matrix[i][j]=matrix[n-i-1][j];
				matrix[n-i-1][j]=temp;
			}
		}
	}
	
	
	static void rotateClockwise(int[][] matrix,int n) {
		transpose(matrix,n);
		columnSwap(matrix,n);
	}
	
	
	static void rotateAntiClockwise(int[][] matrix,int n) {
		transpose(matrix,n);
		rowSwap(matrix,n);
	}
	
	
	public static void main(String[] args) {
		int [][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=matrix.length;
        printMatrix(matrix,n);
        rotateClockwise(matrix,n);
		System.out.println("90 degree clockwise rotation :");
		printMatrix(matrix,n);
		  rotateClockwise(matrix,n);
			System.out.println("180 degree clockwise rotation :");
			printMatrix(matrix,n);
		System.out.println("90 degree anticlockwise rotation :");
		rotateAntiClockwise(matrix,n);
		printMatrix(matrix,n);
       
		
	}

}
