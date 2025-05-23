package Rensyumondai2;

public class Review18 {
    public static void main(String[] args) {
        int num = 8;
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("結果" + sum);
    }
}
