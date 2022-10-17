
public class Heap {
static void heapify(int[]arr,int idx,int size) {
	int L=idx*2+1;
	int R =idx*2+2;
	int largest; 
	if (L<=size && arr[L]>arr[idx]) {
		largest=L;
	System.out.println(arr[L]+" is larger than "+arr[idx]);}
	else largest=idx;
	if (R<=size && arr[R]>arr[largest]) 
	{	largest=R; System.out.println(arr[R]+" is larger than "+arr[largest]);}
	if (largest!=idx) {
		int tmp=arr[idx];
		arr[idx]=arr[largest];
		 arr[largest]= tmp;
		 heapify(arr,largest,size);
		 
		 }
	
	
}
static void BuildHeap(int []arr,int size) 
{ 
	
	for (int i=(size-1)/2;i>=0;i--) 
		heapify(arr,i,size-1);
}
static void Heapsort(int []arr) 
{ 
	BuildHeap(arr , arr.length);
	int size= arr.length-1;
	for (int i=size;i>=0;i--) {
		int tmp=arr[i];
		arr[i]=arr[0];
		arr[0]= tmp;
		System.out.println("next");
		size--;
		heapify(arr,0,size);
		
	 }
}
	public static void main(String[] args) {
      int[]arr= {16, 14 ,10, 8, 7 ,9, 3, 2 ,4, 1};
    //  BuildHeap(arr,arr.length);
      Heapsort(arr);
      for (int i=0;i< arr.length;i++) {
	System.out.println(arr[i]);
}
	}

}
/*
                6
          4          9
         10  2      3    5
         
 * */
