package Array;

public class rotationOf1dArray {

	static void rotate(int[] arr, int rot) {
		int length=arr.length;
		for(int i=0;i<rot;i++) {
			int temp=arr[0];
			for(int j=0;j<length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[length-1]=temp;
		}
	}
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
		int rot=1400;
		rotate(arr,rot);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
