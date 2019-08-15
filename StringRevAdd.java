class Rev{
public static void main(String[]args){
String s1="welcome to java world";
String s2=s1.substring(8,10);
System.out.println(s2);
StringBuilder y= new StringBuilder();
y.append(s2);
y=y.reverse();
System.out.println(y);
String s3=s1.substring(16);
System.out.println(s3);
String s4=s3.substring(0,3);
System.out.println(s4);
StringBuilder x= new StringBuilder();
x.append(s4);
x=x.reverse();

System.out.println(x);

String s5=s3.substring(3,5);
System.out.println(s5);
String s6=x+s5;

System.out.println(s6);
System.out.println(y+" "+s6);

}
}
