package ObjectCloning;

public class objectbody implements Cloneable{
    int age;
    String name;
    int[] arr= new int[1] ;
   public Object clone() throws CloneNotSupportedException{
        return super.clone();
   }
    public objectbody(int age,String name,int data){
    this.age = age;
    this.name = name;
    this.arr[0]= data;
   }
    public  objectbody(objectbody prev){
        this.age = prev.age;
        this.name = prev.name;
    }
}
