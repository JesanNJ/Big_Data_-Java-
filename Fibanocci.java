import java.util.Scanner;

class Fib {
    
    static int Fibanocci (int n){
        if (n<=1)
            return n;
        return Fibanocci(n-1) + Fibanocci (n-2);
    }
    public static void main (String[] args){
        Scanner F = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = F.nextInt();
        for (int i = 0; i < num; i++) {
            int result = Fibanocci(num);
            System.out.print(Fibanocci(i)+" ");
        }
    }
}