import java.util.Scanner;
public class PalindromeUsingStringBuilder
{
	public static void main(String[] args) {
	    Scanner Scan=new Scanner(System.in);
	    boolean retVal;
	    String s1=Scan.nextLine();
	    StringBuilder v=new StringBuilder();
	    v.append(s1);
	    v=v.reverse();
	   
		String s2=v.toString();
		
	      retVal=s1.equalsIgnoreCase(s2);
		
		
	       if(retVal==true){
	           System.out.println("palindrome");
	       }
	       else{
	           System.out.println("not");
	       }
}
}
