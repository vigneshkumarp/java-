import java.util.Scanner;
class FibonacciSquares{
public static void main(String[]args){
Scanner Scan=new Scanner(System.in);
int t1=0;
int t2=1;
System.out.println("enter b:");
int b=Scan.nextInt();
System.out.println("enter i:");
int i=Scan.nextInt(); 
for(int n=0;n<=b;n++){
     int count=0;
     count=t1+t2;
     t1=t2;
     t2=count;
       if(i<=b){
          int sum=0;
          
          sum =count*count;
          
          
          System.out.println("");
         System.out.println(sum);
}
}         
}
}
