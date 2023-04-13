import java.util.*;
class Age{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int Age = input.nextInt();
        if(Age>18){
            System.out.println(Age+ "is right age to vote");
        }
        if(Age<18){
            System.out.println(Age+ "is not right age to vote");
        }
        
        
    }

}