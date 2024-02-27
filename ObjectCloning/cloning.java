package ObjectCloning;

public class cloning {

    public static void main(String[] args) throws CloneNotSupportedException {

    objectbody human1 = new objectbody(23,"Mazher",878);
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.arr[0]);

        //METHOD 1 OF CLONING
      //  objectbody humanclone = new objectbody(human1);
      //  System.out.println(humanclone.name);
      //  System.out.println(humanclone.age);

        //METHOD 2 OF CLONING
objectbody good = (objectbody) human1.clone();
objectbody naee = (objectbody) human1.clone();
good.arr[0]= 34;
        System.out.println(good.arr[0]);
        System.out.println(naee.arr[0]);
        System.out.println(human1.arr[0]);
    }

}
