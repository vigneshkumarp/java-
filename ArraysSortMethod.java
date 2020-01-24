import java.util.Scanner;
import java.util.Arrays;
public class ArraysSortMethod{
{
	public static void main(String[] args) {
	    Scanner Scan=new Scanner(System.in);
	    int n=Scan.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++){
	        arr[i]=Scan.nextInt();
	    }
	    Arrays.sort(arr);
	    for(int j=0;j<arr.length;j++){
	        System.out.print(arr[j]+" ");
	    }
	    
		
	}
}
