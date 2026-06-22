import java.util.Scanner;

class EvenOdd {
    public static void main(String[] arg){
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = Inp.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is an even number.");

        }else{
            System.out.println(num + " is an odd number.");
        }
    }
}