import java.util.*;  
class ListCollection{  
public static void main(String args[]){  
List<String> al=new ArrayList<String>();    
        al.add("Saran");    
        al.add(0,"Vijay");    
        al.add(1,"Kumar");    
        al.add(2,"Sachin");    
        ListIterator itr=al.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }    
}  
} 
