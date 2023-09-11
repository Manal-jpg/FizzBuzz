public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i < 100; i++) {
            boolean divisbleBy3 = i % 3 == 0;
            boolean dividbleBy5 = i % 5 == 0;

            if (divisbleBy3 || dividbleBy5) {
//                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
