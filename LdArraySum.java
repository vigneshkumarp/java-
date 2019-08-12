class LdArraySum{
public static void main(String[]args){
int[] a = {0, 1, 2};
int[] b = {3, 4, 5};
int[] c = new int[a.length];
for (int i = 0; i < a.length; ++i) {
    c[i] = a[i] + b[i];
 System.out.println("the sum is:"+c[i]);
}
}
}
