class FreqAdd{
public static void main(String[]args){
int a[]=new int[]{4,4,5,6,8,9,0};
int n=a.length;
int c=0;
int v=0;

for(int i=0;i<=n-1;i++){
 if(a[i]==4)
 c++;
}
System.out.println(c);

for(int i=0;i<=n-1;i++){
 if(a[i]==5)
 v++;
}
System.out.println(v);
int sum=0;
sum=c+v;
System.out.println(sum);
}
}
