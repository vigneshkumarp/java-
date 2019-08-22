interface Shape{
void draw();
}
class circle implements Shape{
public void draw(){
System.out.println("c");
}
}
class rectangle implements Shape{
public void draw(){
System.out.println("r");
}
}
class TestInterface1{
public static void main(String[]args){
Shape n=new circle();
n.draw();
}
}
