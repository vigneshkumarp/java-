import java.util.Scanner;
class AlphabetOrnot{
public static void main(String[] arg){
Scanner Scan= new Scanner(System.in);
char ch=Scan.next().charAt(0);
if(Character.isLetter(ch))
System.out.println("Alphabet");
else
System.out.println("Nope");
}
}
