
class Rectangle{
int Calculatearea(int length, int breadth)
{int area=length*breadth;
return (area);
}}

class Abc{
public static void main(String[] args){

     Rectangle ab= new Rectangle();
     
      int length=10;
     int breadth=5;
     int a=ab.Calculatearea(length,breadth);
     
     
System.out.print("area of rectangle" +a);
}
}