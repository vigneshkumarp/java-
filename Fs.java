import java.util.Scanner;
class Fs{
public static void main(String[]args){
Scanner Scan=new Scanner(System.in);
int t1=0;
int t2=1;
int s=0;
System.out.println("enter b:");
int b=Scan.nextInt();
System.out.println("enter i:");
int i=Scan.nextInt(); 
for(int n=1;n<=b;n++){
     int count=0;
     count=t1+t2;
     t1=t2;
     t2=count;
       if(i<=b){
          int sum=0;
          
          sum =count*count;
          s=s+sum;
          System.out.println(sum);
          
         
}}
System.out.println("total:"s);
         
}
}
