import java.util.Scanner;

public class HelloWorld{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.println("Hi "+name+", This is Hello World Program");
<<<<<<< HEAD
        System.out.println("xxxxxxxx");
=======
        System.out.println("---------");
>>>>>>> main
        scan.close();
    }
}