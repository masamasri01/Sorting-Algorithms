import java.util.Scanner;

public class main {
static int[] sort(int[] array) {
	
	for (int i=1;i<array.length;i++) {
		int key= array[i];
		for (int j=i-1;j>=0;j--) {
			if(key<array[j]) {
				array[j+1]= array[j];
				array[j]=key;
	          }
			//else break;
		}}
	return array;
}
	public static void main(String[] args) {
		// Insertion Sort
		 Scanner s = new Scanner(System.in);
	      int  length = s.nextInt();
		int []arr = new int[length];
		for (int i=0;i<arr.length;i++) {
			arr[i]= s.nextInt();
		}
		
		int []SortedArr=sort(arr);
		System.out.print("["); {
            for (int i = 0; i < SortedArr.length; i++) {
                System.out.print(arr[i]);
                    if (i != arr.length-1) {
                        System.out.print(",");
                    }
            }
        }
        System.out.println("]");
	}}
