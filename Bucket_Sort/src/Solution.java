import java.util.*;
  
class Solution {
	static int[] insertionSort(int[] array,int length) {
	    
	    for (int i=1;i<length;i++) {
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
    static void bucketSort(int arr[], int arrlength)
    {
        if (arrlength== 0||arrlength== 1)
            return;
        
        int min = arr[0];
        int max= arr[0];
        // 1) structure of Buckets
        for (int i=1;i<arrlength;i++) {
        	if (arr[i]>max) max=arr[i];
        	if (arr[i]<min) min=arr[i];
        }
       
        final int noBuckets =5;
        int range = (int) Math.ceil ((float) (max-min)/ noBuckets);
       if(range==0)return;
        Vector<Integer>[] buckets = new Vector[noBuckets];
       
        for (int i = 0; i < noBuckets; i++) {
            buckets[i] = new Vector<Integer>();//to avoid null
        }
       
       
        for (int i=0;  i<arr.length;i++) {
        	int index_=(arr[i]-min)/range;
        	 buckets[index_].add(arr[i]); 
        	 
        	}
       int indx=0;
        for (int i = 0; i < noBuckets; i++) {
        	int []bucketToArray =new int[buckets[i].size()];
        	
        	 Object[] tmp = buckets[i].toArray();
        	
             for (int z= 0; z < tmp.length; z++) {
            	 int x= (int) tmp[z];
            	 bucketToArray[z]=x;}
            	 bucketToArray=insertionSort(bucketToArray,bucketToArray.length);
            	 
            	
            	 for(int l=0;l<bucketToArray.length;l++ ,indx++) {
            		 arr[indx]=bucketToArray[l];
            		
            	 
             }
           
        }
        
        }

    public static void main(String args[])
    {int arr[]= {1000,0,0,0,44};
    int arrlength=arr.length;
    	 // Insertion Sort
    	 int min = arr[0];
         int max= arr[0];
         // 1) structure of Buckets
         for (int i=1;i<arrlength;i++) {
         	if (arr[i]>max) max=arr[i];
         	if (arr[i]<min) min=arr[i];
         }
        
         final int noBuckets =5;
         int range = (int) Math.ceil ((float) (max-min)/ noBuckets);
         
        
         Vector<Integer>[] buckets = new Vector[noBuckets];
        
         for (int i = 0; i < noBuckets; i++) {
             buckets[i] = new Vector<Integer>();//to avoid null
         }
        
        
         for (int i=0;  i<arr.length;i++) {
         	int index_=(arr[i]-min)/range;
         	System.out.println(arr[i]+"-"+min+"/" +range);
         	if (index_==noBuckets) index_-=1;
         	 buckets[index_].add(arr[i]); 
         	 
         	}
   }}

