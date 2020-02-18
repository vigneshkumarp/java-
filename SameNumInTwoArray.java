public class SameNumInTwoArray
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6};
	    int arr1[]={9,5,1};
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr1.length;j++){
	            if(arr[i]==arr1[j]){
	                System.out.print(arr[i]+" ");
	            }
	        }
	    }
      }
}
