import java.util.Scanner;
class Ndigits{
public static void main(String[] arg){
Scanner Scan= new Scanner(System.in);
System.out.println("Enter the value for N");
int N=Scan.nextInt();
int count=0;
while(N!=0){
N=N/10;
count++;
}
System.out.println("output"+count);

}
}
