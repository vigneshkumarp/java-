import java.util.Scanner;
class AlphabetOrnot2{
public static void main(String[] arg){
Scanner Scan= new Scanner(System.in);
char ch=Scan.next().charAt(0);
if((ch>64&&ch<91))
System.out.println("alpha");
else
System.out.println("not");
}
}
