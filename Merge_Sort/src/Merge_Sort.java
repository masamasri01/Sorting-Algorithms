
class Merge_Sort{
	static void merge(int[] arr) {
		if (arr.length==1) return ;
		div(arr,0,arr.length-1);
		
	}
	 static void div(int[] arr, int start, int end) {
		 if (end   == start) return; 
		 int mid= start + (end - start)/ 2;
		 div(arr,  start,  mid);
		 div(arr,mid+1, end);
		 sort (arr,start,mid,end) ;
	}
	 
	static void sort(int[]arr , int start,int mid, int end) {
		if (arr.length==1) return;
		int[] merged = new int[end-start+1];
		int left=start;
		int right = mid+1;
		
        int t = 0; //buffer pointer
        
        while (left <= mid && right <= end){
            if (arr[left] <= arr[right]){
                merged[t++] = arr[left++];
            }else
            	merged[t++] = arr[right++];
            
        }
        //copy the rest
        while (left<=mid)  merged[t++] = arr[left++];
        while (right<=end)  merged[t++] = arr[right++];
        for (int i = start; i <= end; i++){
            arr[i] = merged[i-start];}
        

        	
			
	}
	public static void main(String[] args) {
		int[]arr= { 5, -2, 23, 7, 87, -42, 509 };
		merge(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
