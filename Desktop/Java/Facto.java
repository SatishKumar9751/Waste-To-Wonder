import java.util.Scanner;
class Facto {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a number to find their factorial value:");
        int fct = scr.nextInt();
        int i, temp = 1;
        for(i=1; i<=fct; i++)
        {
            
            temp = temp * i;
            
            
        }
        System.out.print(temp);
        scr.close();

    }
}
