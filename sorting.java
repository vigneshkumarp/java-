import java.util.Scanner;
class Sorting{
public static void main(String[]args){
Scanner Scan= new Scanner (System.in);
int n=Scan.nextInt();
int arr[]= new int[n];
System.out.println("enter the numbers=");
for(int i=0; i<n; i++){
arr[i]=Scan.nextInt();  
}
for(int i= 0; i<n; i++){
  for(int j= 0; j<n-1; j++){
      int k=j+1;
if(arr[j]>arr[k]){
   int temp = arr[j];
    arr[j] = arr[k];
    arr[k] = temp;
}
}
}
System.out.println("the sorted number are");
for(int i=0; i<n; i++){
System.out.println(arr[i]);
}
}
}
   
