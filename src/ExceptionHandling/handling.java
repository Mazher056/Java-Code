package ExceptionHandling;

public class handling
{
    public static void main(String[] args) {
        int a = 4;int b =0;
        try {
            divide(a,b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void divide(int a,int b) throws Exception{
        try {
            System.out.println(a/b);
        }catch (Exception e){
            throw new Exception("Cannot divide by zero");
        }
    }
}
