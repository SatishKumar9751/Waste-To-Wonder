import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        Scanner scr = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int i, c;
        System.out.println("enter the number of fibonacci series:");
        int fib = scr.nextInt();
        if(fib == 1)
        {
            System.out.println(a);
        }
        else
        {
            
            System.out.println(a + "" + b);
            
            
        
            for(i=2; i<fib; i++)
            {
                
                c = a + b;
                
                System.out.println("" + c);
                a = b;
                b = c;
            }
        scr.close();
        }
    }
        
    }