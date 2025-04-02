import java.util.Scanner;
class Pallindrome{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a number:");
        int pall = scr.nextInt();
        int reverse = pall[-1];
        if(reverse==pall)
        {
            System.out.println("This is a pallindrome number.");
        }
        else{
            System.out.println("This number is not a pallindrme number.");
        }
        scr.close();
    }
}