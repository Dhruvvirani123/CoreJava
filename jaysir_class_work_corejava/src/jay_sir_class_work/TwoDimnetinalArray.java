package jay_sir_class_work;

public class TwoDimnetinalArray {
	
			public static void main(String[] args) {
				int arr1[][]= {{5,2,3},{4,5,6},{7,8,9}};
				for(int row=0;row<3;row++) {
					for(int col=0;col<3;col++) {
						System.out.print(arr1[row][col]);
					}
					System.out.println();
				}
				System.out.println();
				
				int arr2[][]= {{9,2,5},{4,3,2},{9,2,9}};
				for(int row=0;row<3;row++) {
					for(int col=0;col<3;col++) {
						System.out.print(arr2[row][col]);
					}
						System.out.println();
					}
				System.out.println();
				int sum;
				for(int row=0;row<3;row++) {
					for(int col=0;col<3;col++) {
						sum = arr1[row][col] + arr2[row][col];
						System.out.println(+sum);
					}
				}	
		}	
}

