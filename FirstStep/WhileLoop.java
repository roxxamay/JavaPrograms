public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;
        while (count != 9) {
            System.out.println("count value : " + count);
            count++;
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        for (int i = 1; i < 7; i++) {
            System.out.println("count value : " + count);
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        for (count = 1; count != 9; count++) {
            System.out.println("count value : " + count);
        }
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        count = 1;
        do {
            System.out.println("count value : " + count);
            count++;
        } while (count!=11);
    }
}
