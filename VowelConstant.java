import java.util.Scanner;
class VowelConstant{
public static void main(String[] arg){
Scanner Scan =new Scanner(System.in);
System.out.println("enter a choose");
char ch=Scan.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println(" is vowel");
}
else{
System.out.println("is constant");
}
}
}
