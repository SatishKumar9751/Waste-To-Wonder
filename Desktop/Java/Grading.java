import java.util.Scanner;
class Grading{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks = scr.nextInt();
        if(marks <= 50)
        {
            System.out.println("Grade:C");
        }
        else if(marks <= 70)
        {
            System.out.println("Grade:B");
        }
        else{
            System.out.println("Grade:A");
        }
        
        scr.close();
    }
}