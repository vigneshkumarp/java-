class FreqAdds2{
public static void main(String[]args){
int a[]=new int[]{4,4,5,6,8,9,0};
int n=a.length;
int c=0;
for(int i=0;i<=n-1;i++){
if(a[i]==a[i])
c++;
}
System.out.println(c);
}
}
