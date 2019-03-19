import java.util.Scanner;
class SumArray{
public static void main(String[] arg){
Scanner Scan= new Scanner(System.in);
System.out.println("Enter value for N&k");
int N=Scan.nextInt();
int K=Scan.nextInt();
int[] arr=new int[N];
int sum=0;
for(int i=0;i<N;i++){
int temp=Scan.nextInt();
arr[i]=temp;
}
for(int j=0;j<K;j++)
sum=sum+arr[j];
System.out.println("output"+sum);
}
}
