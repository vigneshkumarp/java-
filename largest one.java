import java.util.Scanner;
class LargestOne{
public static void main(String[] arg){
Scanner Scan=new Scanner(System.in);
int a= Scan.nextInt();
int b= Scan.nextInt();
int c= Scan.nextInt();
if(a>b&&a>c)
System.out.println(a+" is greatest");
else if(b>c)
System.out.println(b+" is greatest");
else
System.out.println(c+"is graeatest");
}
}
