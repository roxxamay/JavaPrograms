

class evenSum {
    

    public static void main(String[] args) {
        sum(234);
        sum(4532);
        sum(4224);
        sum(43);
    }

    private static void sum(int number) {

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;

            }

        }
        System.out.println("sum of " + number + " is " + sum);

    }
}
