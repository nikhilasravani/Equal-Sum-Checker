import java.util.Scanner;
public class EqualSumChecker {
    public static boolean hasEqualSum(int num1,int num2,int num3){
        int sum = num1 + num2;
        return num3 == sum;
    }
    public static void main(String [] args){

        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter 1st number:  ");
        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter 2nd number:  ");
        int num2 = number2.nextInt();

        Scanner number3 = new Scanner(System.in);
        System.out.println("Enter 3rd number:  ");
        int num3 = number3.nextInt();

        boolean val = hasEqualSum(num1,num2,num3);
        if(val){
            System.out.println("Equal Sum");
        }
        else{
            System.out.println("Not an equal sum");
        }
    }

}

