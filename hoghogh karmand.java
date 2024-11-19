import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] hoghogh = new double[10];

        //  حقوق ۱۰ کارمند
        for (int i = 0; i < 10; i++) {
            System.out.print("لطفاً حقوق کارمند " + (i + 1) + " را وارد کنید: ");
            hoghogh[i] = scanner.nextDouble();
        }

        System.out.println("\nحقوق کارمندانی که بالای 5700 هستند و محاسبات مالیات و اضافه حقوق:");

        for (int i = 0; i < 10; i++) {
            if (hoghogh[i] > 5700) {
                double maliyat = hoghogh[i] * 0.05; // درصد مالیات
                double children = hoghogh[i] * 0.07; //  درصد برای فرزندان
                double finalhoghogh = hoghogh[i] - maliyat + children; /*  حقوق نهایی*/

                System.out.println(
                        "کارمند " + (i + 1)
                                + ": حقوق اولیه = " + String.format("%.2f", hoghogh[i]) /*فرمتش رو گذاشتم که اعشارش رو بیشتر از 00یا 2 رقم نگیره*/
                                + ", مالیات = " + String.format("%.2f", maliyat)
                                + ", اضافه حقوق = " + String.format("%.2f", children)
                                + ", حقوق نهایی = " + String.format("%.2f", finalhoghogh)
                );


            }
        }

        scanner.close();
    }
}