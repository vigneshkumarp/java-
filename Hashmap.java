import java.util.*;
import java.io.*;

class Hashmap{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> abc=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
           
             abc.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
           
             if(abc.containsKey(s))
                {
                System.out.println(s+ "=" + abc.get(s));
            }
            else
                {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
