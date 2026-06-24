import java.util.Scanner;

class Main {
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        
        for (int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = myObj.nextInt();
        if(isPrime(num)) {
            System.out.println("You are Prime");
        }
        else {
            System.out.println("You are NOT Prime");
        }
    }
}