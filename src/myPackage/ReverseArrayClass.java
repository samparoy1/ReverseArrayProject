package myPackage;
public class ReverseArrayClass {

	static int x=3;
	static int y=3;
	
	public static void main(String[] args) {
		
		int  arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		arrayReverseMethod(arr);

	}
	
	static void arrayReverseMethod(int arr[][]) {
		
	for(int i=0; i<x; i++) {
		int init=0;
		int end=y-1;
		while(init<end) {
			int temp=arr[i][init];
			arr[i][init] = arr[i][end];
			arr[i][end]=temp;
			init++;
			end--;
		}
	}
	
	for(int j=0; j<x;j++) {
		for(int k=0;k<y;k++) {
			System.out.println(arr[j][k]+" ");
		}
		System.out.println();
	}
		
	}

}
