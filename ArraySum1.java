
import java.util.Scanner;
class SumArray{
public static void main(String[] arg){
Scanner Scan= new Scanner(System.in);
System.out.println("Enter value for N");
int N=Scan.nextInt();

int[] arr=new int[N];
int sum=0;
for(int i=0;i<N;i++){
arr[i]=Scan.nextInt();
sum=sum+arr[i];
}
System.out.println("output"+sum);
}
}
