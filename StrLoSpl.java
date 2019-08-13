class StrLoSpl{  
public static void main(String args[]){  
String s1="JAVATPOINT HELLO stRIng";
String s1lower=s1.toLowerCase();  
System.out.println(s1lower);  
for(String w:s1lower.split("\\s",2)){
System.out.println(w);
} 
}} 
