public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(321));
        System.out.println(isPrime(121));
        System.out.println(isPrime(2));
        System.out.println(isPrime(34));
        System.out.println(isPrime(33));
        System.out.println(isPrime(32));
        System.out.println(isPrime(31));
        System.out.println(isPrime(37));
        System.out.println(isPrime(7));
        System.out.println(isPrime(3211));
        System.out.println(isPrime((int) (Math.random())));
        
        for (int i = 0; i < 20; i++) {
            System.out.println(isPrime((int) (Math.random())));
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
            }
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        
    }
    
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
