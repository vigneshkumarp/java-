import java.util.Scanner;
class CheckSign{
public static void main(String[] arg){
Scanner Scan=new Scanner(System.in);
int a= Scan.nextInt();
if (a<0){
System.out.println("negative");
}
else if(a==0){
System.out.println("zero");
}
else{
System.out.print("positive");
}
}
